package com.example.LoginSystem.controller;

import java.io.IOException;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.LoginSystem.dao.CustomerDao;
import com.example.LoginSystem.dao.impl.CustomerDaoImpl;
import com.example.LoginSystem.entity.Customer;
import com.example.LoginSystem.service.CustomerService;
import com.example.LoginSystem.service.service.impl.CustomerServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

@Controller
	public class CustomerController {
	CustomerService ex = new CustomerServiceImpl();
	CustomerDao fin = new CustomerDaoImpl();
	@RequestMapping("/index")
	
	public String index() {
		return "2index";
	}
	
//注册功能
	@RequestMapping("/registerText")
	public String newaccount(HttpServletRequest request) throws IOException {
		
		String id = request.getParameter("customer_id");
		String password = request.getParameter("customer_password");
		String name = request.getParameter("customer_name");
		String type = request.getParameter("customer_type");
		String money = request.getParameter("customer_money");
		int iMoney = Integer.valueOf(money);
		int iId = Integer.valueOf(id);
		int iPassword = Integer.valueOf(password);
		
		int vip;
		vip = ex.checkvip(iMoney,type);
			
		Customer customerone = new Customer(iId,iPassword,name,type,iMoney,vip);
		
		if(ex.checkuser(iId)==0) {
			return"idFalse";
		}
		
		fin.insertUser(customerone);
		return "customer_register";
		
		
	}
	
	//登录操作
	@RequestMapping("/land")
	
	public String land (HttpServletRequest request,Model model)throws IOException{
		
		String id = request.getParameter("customer_id");
		String password = request.getParameter("customer_password");
		int iId = Integer.valueOf(id);
		int iPassword = Integer.valueOf(password);
		
	//用systemNumber接住传回的数，并进行判断，当等于1时显示id错误，当等于2时显示密码错误
	//因为只会传回三个数，所以不进行后续的判断
		int systemNumber = ex.checkaccount(iId, iPassword);
		Customer customerone = fin.selectUserById(iId);
		
		if(systemNumber == 1) {
			return "idFalse";
		}else if(systemNumber == 2) {
			return "passwordWrong";
		}
		
		model.addAttribute("customerName",customerone.getCustomer_name());		
		model.addAttribute("customervip",customerone.getVip());
		int vip = customerone.getVip();
		if(vip == 1) {
			return"iderror";
		}
		
		return "customer_landsuccess";


			
		}
		/*		
		
		if(ex.checkId(iId)) {
	        	return "success";//成功的情况下，跳转到success.html的动态页面
	        }
	        return "idFalse";//失败的情况下，跳转到idFalse.html的动态页面
		
	        
	        //调用密码check方法
	        if(ex.checkPswd(iId, iPassword)) {
	        	return "success";//成功的情况下，跳转到success.html的动态页面
	        }
	        else {return "passwordWrong";//失败的情况下，跳转到passwordWrong.html的动态页面
	        }
		*/

		
	}

	