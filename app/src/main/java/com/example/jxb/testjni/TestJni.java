package com.example.jxb.testjni;/**
 * Created by Administrator on 2015/8/27.
 */

/**
 * @author: JieXingbo
 * @date: 2015-08-27 
 */
public class TestJni
{
	static
	{
		//JNI test
		System.loadLibrary("TestJni");
	}

	native static String getString();
}
