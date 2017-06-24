package com.zillion.gui.test;

import org.junit.Test;

import com.zillion.gui.utils.MD5Util;

/**
 * 测试类。
 * @author wangmin
 * @since 2017年6月24日-上午9:46:03
 * @version V1.0
 *
 */
public class MD5UtilTest {

	@Test
	public void testMD5Util(){
		String oldStr = "123456";
		String newStr =  MD5Util.md5(oldStr);
		System.out.println("加密前的字符串：" + oldStr);
		System.out.println("加密后的字符串：" + newStr);
	}
}
