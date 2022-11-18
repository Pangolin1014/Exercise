package com.example.demo;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.myatis.User;

import com.example.demo.controller.SqlSessionUntil;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Test
	public String textUserSelectById() {
		int Sid = 1;
		int Spassword = 1;
		
//根据用户输入的id查找相应的ID
		
		SqlSession sqlSession = SqlSessionUntil.openSession();
		User user = sqlSession.selectOne("UserSelectById", Sid);

		
		
//对比用户ID和数据库中的ID是否一致，ID不一致时转到检擦ID页面
//ID一致时对比密码是否一致，密码不一致使转到密码错误页面
//都一致时不进行任何处理
		

		
		int id=user.getId();
		int password=user.getPassword();
		
		if( Sid != id ) {
			System.out.print("账号错误");
		}else if(Spassword !=password) {
			System.out.print("密码错误");
		}
		return "SUCCESS";
		
		}
	}


