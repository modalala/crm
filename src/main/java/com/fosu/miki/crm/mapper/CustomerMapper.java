package com.fosu.miki.crm.mapper;

import com.fosu.miki.crm.domain.Customer;
import com.fosu.miki.tk.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper extends MyMapper<Customer> {
}
