package com.java.sai.creationalpatterns.BuilderPattern;

public class LunchOrderTest {
	public static void main(String[] args) {
		LunchOrder order = new LunchOrder.Builder()
				.bread("Chapathi")
				.condiments("Condiments")
				.dressing("dressing")
				.meat("Chicken")
				.build();
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());
	}
}
