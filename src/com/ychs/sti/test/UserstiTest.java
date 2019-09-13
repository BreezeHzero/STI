/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ychs.sti.dao.UserstiDao;
import com.ychs.sti.model.Usersti;

/**
 * Usersti表
 * @author hanyang
 * @version 1.0
 */
public class UserstiTest {
	Logger logger = Logger.getLogger(MajorTest.class);
	UserstiDao ud = new UserstiDao();
	@Test
	public void test2() {
		Usersti list = ud.checkedLogin("行者", "123456");
		logger.info(list);
	}
//	@Test
//	public void test2() {
//		List<Usersti> list  = ud.selectUserByLike("黑", "李", "");
//		logger.info(list);
//	}
//	@Test
//	public void test() {
//		Usersti user = new Usersti("","花魁","张三","123","普通用户");
//		int flag = ud.insertUser(user);
//		logger.info(flag);
//	}
	
}
