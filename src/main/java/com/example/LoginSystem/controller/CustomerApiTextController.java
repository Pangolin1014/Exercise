package com.example.LoginSystem.controller;

import java.io.IOException;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LoginSystem.dao.CustomerDao;
import com.example.LoginSystem.dao.impl.CustomerDaoImpl;
import com.example.LoginSystem.entity.Customer;
import com.example.LoginSystem.service.CustomerService;
import com.example.LoginSystem.service.service.impl.CustomerServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

@RestController

@RequestMapping("/apiText")


public class CustomerApiTextController {
		CustomerDao ex = new CustomerDaoImpl();
		CustomerService fin = new CustomerServiceImpl();
		
		
		@PostMapping
		public Customer apiText(HttpServletRequest request) throws IOException {
			
		
		String sId = request.getParameter("customer_id");
		int id = Integer.valueOf(sId);
		
		Customer abc = new Customer();
		
		abc = ex.selectUserById(id);	
		return abc;
		
		
		
		

		}
}

		