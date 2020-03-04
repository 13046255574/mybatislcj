package com.mybatis.mapper;

import com.mybatis.po.Customer;

import java.util.List;

/**
 * @auther：lcj
 * @date 2020/3/4 下午 12:45
 */
public interface CustomerMapper {
    Customer findById(String  id);
    List<Customer> findAll();
    int updateCustomerById(Customer customer);
    int deleteCustomer(Customer customer);
    int insertCustomer(Customer customer);
}