package com.shophub2.service;

import java.util.ArrayList;
import java.util.List;

import com.shophub2.bean.UserTransaction;

public class CartService 
{ 
	List<UserTransaction> list =new ArrayList<>();
	public List<UserTransaction> buyNow(UserTransaction ut)
	{
          list.add(ut);		
          System.out.println(list);
		return list;
	}
	
	
}
