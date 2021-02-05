package com.tyrowebdev.E_Banking.model;

public class GenerateOTP {

	public static int generateOTP()
	{
		int otp = (int)(Math.random()*9000)+1000;
		return otp;
	}
}