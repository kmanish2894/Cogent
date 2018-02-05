package com.manish;

public class Password {
	
	static Password p = new Password();
	
	final static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String pass(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*letters.length());
			builder.append(letters.charAt(character));
		}
		return builder.toString();
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return pass(10);
	}

}
