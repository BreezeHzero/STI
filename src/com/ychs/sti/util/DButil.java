/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



/**
 * 数据库连接实用类
 * @author hanyang
 * @version 1.0 2019-7-23
 */
public class DButil {
	public static SqlSessionFactory sessionFactory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *创建能执行映射文件中sql的sqlSession 
	 * @return  执行sql的sqlSession对象
	 */
	public static SqlSession getSession() {
		return sessionFactory.openSession();
	}
	/**
	 * 关闭session
	 * 
	 * @param session 要被关闭的session对象
	 */
	public static void closeSession(SqlSession session) {
		if (session != null) {
			session.close();
		}
	}
	public static void main(String[] args) {
		SqlSession session = DButil.getSession();
		System.out.println(session);
		
		
	}
}
