package com.myatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*public class MyBatisIntroductionTest 
{
    public static void main( String[] args ) throws IOException
    {
    	//加载MyBatis的核心配置文件，获取SqlSeeionfactory(在官网上直接导)
    	String resource = "mybatis-config.xml";
    	InputStream inputStream = Resources.getResourceAsStream(resource);
    	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    	  //获取sqlSession对象，用他来执行SQL
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行SQL
        int count = sqlSession.insert("insertCar");
        sqlSession.commit();
        //返回值是影响数据库表中的记录条数
        System.out.println("插入了"+count+"条记录");
    }
  
}*/
