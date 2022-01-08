package icici.loans.eduloans;

public class Calculations {

	int a,b,result;	
	
	public Calculations(int a, int b)
	{
		super();
		this.a = a;
		this.b = b;
	}
	public void add()
	{
		result =a+b;
		System.out.println(" Sum of a and b is:" + result);
	}
	public void sub()
	{
		result =a-b;
		System.out.println(" Diff of a and b is:" + result);
	}
	
	
	public static void main(String[] args) 
	{
		Calculations obj = new Calculations(200,100);
		obj.add();
		obj.sub();

	}

}
