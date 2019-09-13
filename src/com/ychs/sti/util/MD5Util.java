/**
 * CopyRight © 2019All rights reserved.
 * 
 * @date: 2019年8月11日
 */
package com.ychs.sti.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密实体工具类
 * @author 李创博
 */
public class MD5Util {
	/**
	 * 将源字符串使用MD5加密为字节数组
	 * @param source 源字符串
	 * @return 加密后的字符数组
	 */
	public static byte[] encode2bytes(String source) {
		byte[] result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(source.getBytes("UTF-8"));
			result = md.digest();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * 将源字符串使用MD5加密为32位16进制数
	 * @param source 源字符串
	 * @return 加密后的32位16进制数
	 */
	public static String encode2hex(String source) {
		byte[] data = encode2bytes(source);
 
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			String hex = Integer.toHexString(0xff & data[i]);
			
			if (hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}
		
		return hexString.toString();
	}
	
	/**
	 * 验证字符串是否匹配
	 * @param unknown 待验证的字符串
	 * @param okHex	使用MD5加密过的16进制字符串
	 * @return	匹配返回true，不匹配返回false
	 */
	public static boolean validate(String unknown , String okHex) {
		return okHex.equals(encode2hex(unknown));
	}
}
