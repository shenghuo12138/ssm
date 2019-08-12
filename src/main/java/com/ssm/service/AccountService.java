package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

/**
 * @author $(USER)
 * @create $(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public interface AccountService {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}

