package com.example.demo.java8;

public interface JDK8Interface1 {
	public static void staticMethod() {
		System.out.println("接口中的静态方法");
	}

	// .使用default之后就可以定义普通方法的方法体了
	public default void defaultMethod() {
		System.out.println("接口中的默认方法");
	}
}
