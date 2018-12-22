package com.shophub2.dao;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shophub2.bean.User;


public class UserDao implements IUserDao {
	JdbcTemplate jdbcTemplate;
	String query;
	
	
	

	public UserDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public String get(long userId) {
		Object[] inputs=new Object[]{"Birappa", 123456};
		query="SELECT USERNAME FROM users WHERE USERNAME=? AND password=?";
		String empName=jdbcTemplate.queryForObject(query,inputs, String.class);
		return empName;
		
	}

	public List<User> getAll() {
	
		return null;
	}

	public boolean add(User user) {
		
		return false;
	}

	public boolean remove(long userId) {
	
		return false;
	}

	public boolean update(User user) {
		
		return false;
	}

	public boolean contains(long userId, String userName) {
		
		return false;
	}
	
public static void main(String[] args) {
	//UserDao userDao=new UserDao();
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	UserDao jdbcModel=context.getBean(UserDao.class);
	/*jdbcModel.createTable();
	jdbcModel.insertRow();*/

	System.out.println(jdbcModel.get(1));
	//System.out.println(userDao.get(1));
}
}
