package icici.loans.eduloans;

public class TypeCastingDemo
{
          
	
	public static void main(String[] args) 
	{
		//byte, short, int,long, float, double, boolean, char
		// 1-litre Bottle --> 500 ml -->There is no risk --> Widening
		// 1-litre Bottle --> 1.5 Litre  --> Risk of Overflow  -->Narrowing
		
		int x =10;
		System.out.println(x);
		double y=x;   //converting into to double
		System.out.println(y);
		
		int a=65;
		System.out.println(a);
		char b= (char) a; //using typecast to convert char to int
		System.out.println(b); //it will display the ascii

	}

}
