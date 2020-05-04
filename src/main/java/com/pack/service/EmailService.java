package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmailService 
{
	@Autowired
	JavaMailSenderImpl   impl;
	
	public  void  sendEmail(String  email, String  name) {
		SimpleMailMessage  msg =new  SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Customer Registration");
		String  text="Dear "+name+", \n You have successfully registered. \n "+
		             "<a href=http://localhost:2020/CRM/login> click here to login \n"+
				     "Regards\n Supporting Team";
		msg.setText(text);
		impl.send(msg);
}
}