package com.java.sai.creationalpatterns;

public class Singleton {
	private static Singleton singleTon = null;
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		if(null == singleTon) {
		 singleTon	= new Singleton();
		}
		return singleTon;
	}
}
