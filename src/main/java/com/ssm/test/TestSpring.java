package com.ssm.test;

import com.ssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author $(USER)
 * @create $(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class TestSpring {
    @Test
    public void run1() {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}
