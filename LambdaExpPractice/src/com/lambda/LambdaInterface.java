package com.lambda;

public interface LambdaInterface {
	
	public int add(int a, int b);
	
	default public void displayStirng(String msg){
		System.out.println(msg);
	}
}
