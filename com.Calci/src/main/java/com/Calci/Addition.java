package com.Calci;

public class Addition {

int n1;
int n2;
int add;
public Addition() {
}
public Addition(int a,int b) {
	n1=a;
	n2=b;
}

public int performOperation()
{
	add=n1+n2;
	return add;
	
	}
}
