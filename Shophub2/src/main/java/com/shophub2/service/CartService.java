package com.shophub2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shophub2.bean.UserTransaction;
import com.shophub2.dao.CartDao;

public class CartService 
{ 
	@Autowired
	CartDao cartdao;
	
	List<UserTransaction> list =new ArrayList<>();
	public List<UserTransaction> buyNow(UserTransaction ut)
	{
          list.add(ut);		
          System.out.println(list);
		return list;
	}
	
	public boolean addProductToCart(UserTransaction trans){
		return cartdao.add(trans);
	}
}
