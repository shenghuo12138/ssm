package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author $(USER)
 * @create $(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */

/**
 * 账号dao的接口
 */
@Repository
public interface AccountDao {
    //查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();
    //保存账户信息
    @Insert(value = "insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
