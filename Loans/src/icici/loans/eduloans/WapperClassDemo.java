package icici.loans.eduloans;

public class WapperClassDemo {

	public static void main(String[] args)
	{
       /*
        byte --> Byte
        short --> Short
        int --> Integer
        long  --> Long
        float  --> Float
        double  --> Double
        char --> Character
        boolean --> Boolean
        */
        
		int x =10;  // primitive variable
		System.out.println(x);
		Integer y = Integer.valueOf(x);
		
		//Integer y =x ; // converting primitive type to reference type called autoboxing
		System.out.println(y);
		
		System.out.println("------------------");
		
		String s1="417";
		String s2 = "420";
		System.out.println(s1+s2); // it will concatenate
		
		//convert to float or Int
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		int result = p1 + p2; // it will add the values
		System.out.println(result);

	}

}
