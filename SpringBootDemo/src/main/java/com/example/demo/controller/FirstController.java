package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;








import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myatis.Customer;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstController {

//注册功能
//实现从前端输入ID和密码导入数据库

/*		
	@RequestMapping("/register")
	public String Register(HttpServletRequest request) {
		
		String Rid = request.getParameter("id");
		String Rpassword = request.getParameter("password");
		
		
		Map<String,Object> map = new HashMap<>();
		map.put("id",Rid);
		map.put("password", Rpassword);
		
		SqlSession sqlSession = SqlSessionUntil.openSession();
		int count = sqlSession.insert("UserInsertById", map);
		System.out.print(count);
		sqlSession.commit();
		sqlSession.close();
		
		return "SUCCESS";
	}
	
	
	

//登录功能
//接受用户名的账号和密码并与后端的数据库进行比对
	
	@RequestMapping("/echotext")
	public String getText(HttpServletRequest request,Model model) {
		
//取得用户输入的id和密码
		
		String sId =  request.getParameter("id");
		String sPassword =  request.getParameter("password");
		int sidInt = Integer.valueOf(sId);
		int intPassword = Integer.valueOf(sPassword);
		
//根据用户输入的id查找相应的ID信息
//并放入实体类中
		
		SqlSession sqlSession = SqlSessionUntil.openSession();
		User user = sqlSession.selectOne("UserSelectById", sidInt);
		
		
//对比用户ID和数据库中的ID是否一致，ID不一致时转到检查ID页面
//ID一致时对比密码是否一致，密码不一致使转到密码错误页面

	
		int id=user.getId();
		int password=user.getPassword();
		
		if( sidInt != id ) {
			return "iderroe";
		}else if(intPassword !=password) {
			return"passworderroe";
		}

//都一致时跳转进详情页面，页面中显示用户数据库中的数据
		
	
		model.addAttribute("userId", id);
		model.addAttribute("userPassword",password);
	
		return "echotext";
	}
	

//在登录成功的界面中实现对数据条的改变
	@RequestMapping("/alter")
	public String alterText(HttpServletRequest request) {
		
		
		
		
//取得前端传回来的数据并修改应该为int类型的数据
		
		
		String rPassword = request.getParameter("password");
		String rAge = request.getParameter("age");
		String rSex = request.getParameter("sex");
		int iPassword = Integer.valueOf(rPassword);
		int iAge = Integer.valueOf(rAge);


		
		
		return"SUCCESS";
	}
	
	*/
	
//测试注册
	
	@RequestMapping("/registerText")
	public String Register(HttpServletRequest request) {
		
		String Rid = request.getParameter("customer_id");
		String Rpassword = request.getParameter("customer_password");
		String Rname = request.getParameter("customer_name");
		String Raddress = request.getParameter("customer_address");
		String Rtype = request.getParameter("customer_type");

		
		Map<String,Object> map = new HashMap<>();
		map.put("id",Rid);
		map.put("password", Rpassword);
		map.put("name", Rname);
		map.put("address", Raddress);
		map.put("type", Rtype);
		
		SqlSession sqlSession = SqlSessionUntil.openSession();
		int count = sqlSession.insert("CustomerInsertById", map);
		System.out.print(count);
		sqlSession.commit();
		sqlSession.close();
		
		return "customer_register";
	}
	
	
	
//测试登录
	@RequestMapping("/land")
	public String getText(HttpServletRequest request,Model model) {
		
		
//使用getParameter方法获得前端数据
//但因为getParameter方法只能拿到String类型的数据，所以原本是int类型的数据要转一下形态
		
		String sId =  request.getParameter("customer_id");
		String sPassword =  request.getParameter("customer_password");
		int sidInt = Integer.valueOf(sId);
		int intPassword = Integer.valueOf(sPassword);
		
		SqlSession sqlSession = SqlSessionUntil.openSession();
		Customer customer = sqlSession.selectOne("CustomerSelectById", sidInt);
		
		
//对比用户ID和数据库中的ID是否一致，ID不一致时转到检查ID页面
//ID一致时对比密码是否一致，密码不一致使转到密码错误页面

	
		int id = customer.getCustomer_id();
		int password = customer.getCustomer_password();
		String name = customer.getCustomer_name();
		String address = customer.getCustomer_address();
		String type = customer.getCustomer_type();
		
		if( sidInt != id ) {
			return "iderroe";
		}else if(intPassword !=password) {
			return"passworderroe";
		}

//都一致时跳转进详情页面，页面中显示用户数据库中的数据
		
	
		model.addAttribute("customerId", id);
		model.addAttribute("customerPassword",password);
		model.addAttribute("customerName",name);
		model.addAttribute("customerAddress",address);
		model.addAttribute("customerType",type);
		
		return "customer_more";
	}
	
//修改功能
	@RequestMapping("/amend")
	public String amend(HttpServletRequest request) {
		
		String Sid = request.getParameter("customer_id");
		String Spassword = request.getParameter("customer_password");
		String Sname = request.getParameter("customer_name");
		String Saddress = request.getParameter("customer_address");
		String Stype = request.getParameter("customer_type");
		int Iid = Integer.valueOf(Sid);
		int Ipassword = Integer.valueOf(Spassword);

		Customer customer = new Customer(Iid,Ipassword,Sname,Saddress,Stype);
		
		SqlSession sqlSession = SqlSessionUntil.openSession();
		int count = sqlSession.insert("UpdetaById", customer);
		System.out.print(count);
		sqlSession.commit();
		sqlSession.close();
		
		return"SUCCESS";
	}
//删除功能
	
	@RequestMapping("/delete")
	public String DeleteById(HttpServletRequest request) {
		
		String Sid = request.getParameter("customer_id");
		int Iid = Integer.valueOf(Sid);
		
		SqlSession sqlSession = SqlSessionUntil.openSession();
		int count = sqlSession.delete("DeleteById", Iid);
		System.out.print(count);
		sqlSession.commit();
		sqlSession.close();
		
		return"SUCCESS";
	}
	
}


