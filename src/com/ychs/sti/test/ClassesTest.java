/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ychs.sti.dao.ClassesDao;
import com.ychs.sti.model.Classes;

/**
 * @author hanyang
 * @version 1.0
 */
public class ClassesTest {
	Logger logger = org.apache.log4j.Logger.getLogger(ClassesTest.class);
	ClassesDao cd = new ClassesDao();
	@Test
	public void test() {
		List<Classes> list = cd.selectClassinfoByMajorid("人工智能","2016");
		logger.info(list);
	};
	
}
