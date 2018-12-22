package com.shophub2.controllers;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shophub2.bean.UserTransaction;
import com.shophub2.service.CartService;

public class TestService 
{
	public static void main(String[] args) {
		/*CartService service =new CartService();
		service.buyNow(new UserTransaction(1, 1, "huli", 1, 1000, 1000));
		service.buyNow(new UserTransaction(2, 1, "huli", 1, 10000, 1000));*/
		
		
		ApplicationContext c= new ClassPathXmlApplicationContext("spring.xml");
		 CartService service = (CartService) c.getBean("hi");
			service.buyNow(new UserTransaction(1, 1, "huli", 1, 1000, 1000));
			service.buyNow(new UserTransaction(2, 1, "huli", 1, 10000, 1000));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
