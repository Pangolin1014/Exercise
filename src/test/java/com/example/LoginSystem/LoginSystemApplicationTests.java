package com.example.LoginSystem;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.LoginSystem.service.service.impl.CustomerServiceImpl;


@SpringBootTest
class LoginSystemApplicationTests {

	@Test
	public void checkVipText() throws IOException {
		assertEquals(1,new CustomerServiceImpl().checkvip(100000,"法人"));
		assertEquals(1,new CustomerServiceImpl().checkvip(100001,"法人"));
		assertEquals(0,new CustomerServiceImpl().checkvip(10000,"法人"));
		
	}
	@Test
	public void checkVipText2()throws IOException{
		assertEquals(1,new CustomerServiceImpl().checkvip(1001,"个人"));
		assertEquals(1,new CustomerServiceImpl().checkvip(1000,"个人"));
		assertEquals(0,new CustomerServiceImpl().checkvip(100,"个人"));
	}

}
