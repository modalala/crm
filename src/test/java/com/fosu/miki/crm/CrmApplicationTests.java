package com.fosu.miki.crm;

import com.fosu.miki.crm.domain.Customer;
import com.fosu.miki.crm.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrmApplicationTests {

    @Resource
    private CustomerMapper customerMapper;
    @Test
    public void contextLoads() {
    }

    @Test
    public void customerTest(){
        Example example = new Example(Customer.class);
        example.createCriteria().andEqualTo("username","miki");
        Customer customer = customerMapper.selectOneByExample(example);
        System.out.println(customer);
    }
}
