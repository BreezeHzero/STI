/**
 * CopyRight (c) ychs 2019
 */
package com.ychs.sti.test;

import java.util.List;

import org.junit.Test;
import org.apache.log4j.Logger;

import com.ychs.sti.dao.MajorDao;
import com.ychs.sti.model.Major;


/**
 * @author hanyang
 * @version 1.0
 */
public class MajorTest {
	Logger logger = Logger.getLogger(MajorTest.class);
	MajorDao majordao = new MajorDao();
	@Test
	public void selectAllMajorTest() {
	List<Major> list = majordao.selectMajors();
	logger.info(list);
	
	}
//	@Test
//	public void test() {
//		int flag = majordao.insertMajor("8", "计算机工程系", "数媒");
//		logger.info(flag);
//	}
}
