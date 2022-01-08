package icici.loans.carloans;

public abstract class FirstAbstract //abstract class contains abstract and concrete behaviours
{
   public void m1()
   {
	System.out.println("I am m1 concrete from first Abtsract Class");  
   }
   
	public abstract void m2();//using astract keyword here to make the method abstract
	
	public static void main(String[] args) 
      {
	            //FirstAbstract obj = new FirstAbstract();  : we can't instantiate the object of abstract class
		 FirstAbstract obj = new ChildClass();
		 obj.m1(); // m1 will execute from FirstAbstarct class
		 obj.m2(); //m2 is from childclass
      }
}
