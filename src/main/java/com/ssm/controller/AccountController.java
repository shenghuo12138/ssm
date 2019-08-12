package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author $(USER)
 * @create $(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    /**
     * 查询所有的数据
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        for (Account account : list) {
            System.out.println(account);
        }
        return "list";
    }

    /**
     * 保存用户数据
     * @param account
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        System.out.println(request.getContextPath()+"/account/findAll");
        return;
    }
}
