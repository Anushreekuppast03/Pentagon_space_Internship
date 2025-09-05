package in.com.java8;



//interface concrete method should be default
//or static
//2. default method we can override in imp1
//class
interface Vtu1
{
	public default void fee1()
	{
		System.out.println("fee 50 k");
		
	}
}
class PES implements Vtu1{
	public void fee1()  //dont use default keyword
	{
		System.out.println("fee 70 k");
	}
}

public class Secondproject {
	public static void main(String[] args) {
		PES p=new PES();
		p.fee1();
		Vtu1 v=new PES();
		v.fee1();
	}
}