/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.test;

import org.apache.log4j.*;
import org.junit.Test;

import com.ychs.sti.dao.LoginlogDao;
import com.ychs.sti.model.Loginlog;

/**
 * @author hanyang
 * @version 1.0
 */
public class LoginlogTest {
	Logger logger = Logger.getLogger(LoginlogTest.class);
	LoginlogDao ld = new LoginlogDao();
	@Test
	public void test() {
		Loginlog loginlog = new Loginlog("","鲁智深","","192.168.1.1");
		int flag = ld.insertLoginlog(loginlog);
		logger.info(flag);
	}
}
