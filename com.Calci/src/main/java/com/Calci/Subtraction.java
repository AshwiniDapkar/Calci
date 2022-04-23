package com.Calci;

public class Subtraction {
	int n1;
	int n2;
	int sub;
	public Subtraction() {
		
	}
	public Subtraction(int a,int b) {
		n1=a;
		n2=b;
	}
	public int performOperation()
	{
		sub=n1-n2;
		return sub;
		
		}
}
