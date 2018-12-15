package com.java.sai.creationalpatterns;

public class SingletonDemo {
	public static void main(String[] args) {
		Runtime runtime1 = Runtime.getRuntime();
		runtime1.gc();
		System.out.println(runtime1);
		Runtime runtime2 = Runtime.getRuntime();
		runtime2.gc();
		System.out.println(runtime2);
		
		if(runtime1 == runtime2) {
			System.out.println("These two are of same instance");
		}
		
	}
}
