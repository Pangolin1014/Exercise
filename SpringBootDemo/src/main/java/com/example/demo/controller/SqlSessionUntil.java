package com.example.demo.controller;


import java.io.IOException;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUntil {
		
	private SqlSessionUntil() {}
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			sqlSessionFactory =  new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	public static SqlSession openSession() {
		return sqlSessionFactory.openSession();
		
	}

}
