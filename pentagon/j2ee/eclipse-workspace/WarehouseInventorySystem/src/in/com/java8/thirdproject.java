package in.com.java8;


class A{
	void placement() {
		System.out.println("trust the process");
	}
}
class B extends A{
	 void placement() {
		System.out.println("don't worry about result");
	}
}

public class thirdproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.placement();

	}

}
