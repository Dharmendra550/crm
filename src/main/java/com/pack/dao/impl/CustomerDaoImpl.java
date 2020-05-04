package com.pack.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.dao.CustomerDao;
import com.pack.model.CustomerBean;
import com.pack.model.Gender;
@Repository
public class CustomerDaoImpl implements CustomerDao 
{
  @Autowired
  JdbcTemplate jdbcTemplate;
	@Override
	public boolean addCustomer(CustomerBean customerBean) {
		int count = jdbcTemplate.queryForObject("select  count(*) from  customers where  email=?", Integer.class, customerBean.getEmail());
		if(count==1) {
			return  false;
		}
		else {
			String  gender="";
			if(customerBean.getGender() == Gender.MALE)
			{
				gender="male";
			}
			else if(customerBean.getGender()==Gender.FEMALE) {
				gender="female";
			}
			else {
				gender="others";
			}
			
			jdbcTemplate.update("insert into customers(email,firstname,lastname,password,gender,country)  values(?,?,?,?,?,?)", customerBean.getEmail(),customerBean.getFirstName(),customerBean.getLastName(),customerBean.getPassword(),gender,customerBean.getCountry());
			return true;
		}
	}

	
	

	@Override
	public boolean loginCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
