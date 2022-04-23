package com.vision.Calci;

import org.junit.Assert;
import org.junit.Test;

import com.Calci.Addition;
import com.Calci.Division;
import com.Calci.Multiplication;
import com.Calci.Subtraction;

public class TestCase {

	@Test
	public void test_t01_add() {
	int actual;	
	int expected=5;		
Addition a=new Addition(2,3);	
actual=a.performOperation();
Assert.assertEquals(expected, actual); //only need this 

/*if(actual==expected) {
	System.out.println("test case is pass");
}
else
{
System.out.println("test case is fail");
Assert.fail("test case is fail"); // it shows cross when tc is fail
}*/
}
	@Test
		public void test_t02_sub() {
		int actual;	
		int expected=4;		
	Subtraction s=new Subtraction(7,3);	
	actual=s.performOperation();
	Assert.assertEquals(expected, actual);
}
	@Test
	public void test_t03_mul() {
	int actual;	
	int expected=21;		
Multiplication m=new Multiplication(7,3);	
actual=m.performOperation();
Assert.assertEquals(expected, actual);
}
	@Test
	public void test_t04_div() {
	int actual;	
	int expected=2;		
Division d=new Division(7,3);	
actual=d.performOperation();
Assert.assertEquals(expected, actual);
}
}
