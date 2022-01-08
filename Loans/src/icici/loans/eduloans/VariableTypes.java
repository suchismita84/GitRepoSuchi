package icici.loans.eduloans;

public class VariableTypes {
 // Primitive variables
	int x = 100; // Instance variable (defined within a class outside a method) or Global variable or Non static variable
	static String cname = "TCS"; // Static variable or static global variable
	static float roi =8.5f; // any commonly used data is declared as a static variable, when data is not common we go for instance variable 	
	public void m1()
	{
		//int y = 200; //local variable : defined inside a method
		int x = 200;
		//System.out.println(y);
		System.out.println(x); // we access instance variable directly without any class reference
	    System.out.println(this.x); // calling the instance variable here using this
		System.out.println(cname);
	}
	
	
	public static void m2()
	{
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
	}
	
	public static void main(String[] args) 
	{
	VariableTypes obj = new VariableTypes(); //non-primitive/Reference Variable
	System.out.println(obj.x);//Instance variable is called  through class reference
	System.out.println(cname); // Static variable is called directly or with class reference not with object reference
	System.out.println(VariableTypes.cname);
	} 

}
