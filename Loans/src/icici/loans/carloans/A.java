package icici.loans.carloans;

import java.util.Date;

//default Class means when we define as  : class A
 public class A 
{
	 int x =100 ; // default variable, because there is no access modifier
	public void m1()
	{
		System.out.println("I am m1 from A");
	}
	
	public static void m6()
	{
		System.out.println("I am static m6");
	}
	static // static block is always implicitly called, It will be executed first
	{
		System.out.println("I am static block");
	}
	//we can have more than one static block
	static 
	{
		Date dt = new Date(); // current date and time
		System.out.println(dt);
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
        m6(); //static method is called directly or with class name
	}
}
// default variable can be accessed within a class
 // in same package different class , we can access with both parent and child reference
 // outside the package different class : can't access the default variable'