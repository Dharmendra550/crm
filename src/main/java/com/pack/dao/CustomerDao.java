package com.pack.dao;

import org.springframework.stereotype.Repository;

import com.pack.model.CustomerBean;

@Repository
public interface CustomerDao 
{
boolean addCustomer(CustomerBean customerBean);
boolean loginCustomer(String email,String password);
}
