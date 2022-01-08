package icici.loans.carloans;

public class B extends A //IS A Relationship
{
	public void m1()
	{
		System.out.println("I am overriden m1 in B");//here we are overriding method m1 in class B
	}
	public void m2()
  {
	System.out.println("I am m2 in B");  
  }
	public static void main(String[] args) 
	{
			
		A a=new A(); //created A class object within B (Has a relationship : using a class object we can access only A class method/properties)
		a.m1();
		
		B b=new B();
		b.m2(); //accessing child class properties, calling method from class B
        b.m1(); //accessing parent class properties, calling method from class A, // when we override m1, then with child class reference child class method m1
        
        //we can use parent class reference variable to refer/hold child class object
        A obj = new B(); // Upcasting
        obj.m1(); //this m1 belongs to parent class A in compilation time, but in run time it executes B class overriden method.
        
        B obj1= (B) obj;
        obj1.m1();
        obj1.m2();
        
        //We cant use parent class reference variable to hold parent class object
        B a1 = (B) new A(); //downcasting gives runtime error
        B p = a1;
        p.m1();
        p.m2();
	}
	

}
