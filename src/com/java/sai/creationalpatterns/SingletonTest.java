package com.java.sai.creationalpatterns;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getSingleton();
		System.out.println(singleton1);
		
		Singleton singleton2 = Singleton.getSingleton();
		System.out.println(singleton2);
	}
}
