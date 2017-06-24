package com.zillion.gui.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * 加密工具类。
 * @author wangmin
 * @since 2017年6月24日-上午9:46:30
 * @version V1.0
 *
 */
public class MD5Util {

	/**
	 * 将给定的字符串加密后返回。
	 * @param data
	 * @return
	 */
	public static String md5(String data){
		try {
			byte[] md5 = md5(data.getBytes("UTF-8"));
			return toHexString(md5).toUpperCase();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static byte[] md5(byte[] data){
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			md.update(data);
			return md.digest();
		} catch (Exception e) {
			return new byte[]{};
		}
	}
	
	
	public static String toHexString(byte[] md5){
		StringBuilder sb = new StringBuilder();
		for (byte by : md5){
			sb.append(leftPad(Integer.toHexString(by & 0xff), '0', 2));
		}
		return sb.toString();
	}
	
	public static String leftPad(String hex, char c, int size){
		char[] ch = new char[size];
		Arrays.fill(ch, c);
		System.arraycopy(hex.toCharArray(), 0, ch,ch.length - hex.length(), hex.length());
		return new String(ch);
	}
}
