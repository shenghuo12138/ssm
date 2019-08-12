package com.ssm.service.impl;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author $(USER)
 * @create $(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    public List<Account> findAll() {
        System.out.println("业务层：查询所有信息......");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("业务层：保存账号信息......");
    }
}
