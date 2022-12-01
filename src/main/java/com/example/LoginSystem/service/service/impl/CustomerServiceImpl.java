package com.example.LoginSystem.service.service.impl;

import java.io.IOException;

import com.example.LoginSystem.dao.CustomerDao;
import com.example.LoginSystem.dao.impl.CustomerDaoImpl;
import com.example.LoginSystem.entity.Customer;
import com.example.LoginSystem.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	CustomerDao Dao = new CustomerDaoImpl();
	


	@Override
	//只判断是否存在用户名
	public boolean checkId(int id) throws IOException {
		boolean result = false;
		Customer ex = Dao.selectUserById(id);
		if(ex==null) {
			result = false;
		}else {
			result = true;
		}
		return result;
	}

	@Override
	//判断用户名密码是否正确
	public boolean checkPswd(int id,int password) throws IOException {
		if(checkId(id)) {
			Customer ex = Dao.selectUserById(id);
			if(password==ex.getCustomer_password()) {
				return true;
			}
		};
		
		return false;
	}
	//根据用户的注册资金判断用户的VIP等级
	@Override
	public int checkvip(int iMoney,String type) throws IOException {
		int vip;
		if(iMoney>=100000 && type.equals("法人")) {
			vip=1;
		}
		
		if(iMoney>=1000 && type.equals("个人")) {
			vip=1;
		}vip=0;
		return vip;
	}
//判断账号和密码的对错
	@Override
	public int checkaccount(int id, int password) throws IOException {
		Customer ex = Dao.selectUserById(id);
		if(ex==null) {
			return 1;
		}else if (password != ex.getCustomer_password()) {
			return 2;
		}
		return 0;
	}

	@Override
	public int checkuser(int id) throws IOException {
		Customer ex = Dao.selectUserById(id);
		if(ex==null) {
			return 1;
		}
		return 0;
	}
	
	/*
	 * 	public int checkvip(int iMoney,String type) throws IOException {
		int vip;
		if((iMoney>=100000 && type.equals("法人"))||(iMoney >= 1000 && type.equals("个人"))){
			vip=1;
		}else vip=0;
			
		return vip;
		
		*/

}
