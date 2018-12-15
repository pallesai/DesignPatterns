package com.java.sai.creationalpatterns;

public class Singleton {
	private static Singleton singleTon = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		return singleTon;
	}
}
