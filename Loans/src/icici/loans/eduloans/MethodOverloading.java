package icici.loans.eduloans;

public class MethodOverloading 
{
	/*
	 * public void m1(int x) { System.out.println(x); }
	 */
 public void m1(float x) //method overloading
 {
	 System.out.println(x);
 }
 public void m1(String x) //method overloading
 {
	 System.out.println(x);
 }
 public void m1(Integer x) //method overloading
 {
	 System.out.println(x);
 }
 public void m1(Number x) //method overloading
 {
	 System.out.println(x);
 }
 public void m1(Object x) //method overloading
 {
	 System.out.println(x);
 }
 public static void main(String[] args) {
	 MethodOverloading obj = new MethodOverloading ();
	 obj.m1(10);
	 obj.m1(10.67f);
	 obj.m1("Suchi");
	 obj.m1(1000);
	 obj.m1(100.34f);
	 }
}
