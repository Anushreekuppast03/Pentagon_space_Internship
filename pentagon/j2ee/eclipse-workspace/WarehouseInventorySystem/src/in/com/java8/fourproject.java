package in.com.java8;



interface PS{
	static void placement() {
		System.out.println("Trust the process");
	}
}
class pentagonspace implements PS{
	static void placement() {
		System.out.println("don't worry about Result");
	}
}

public class fourproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PS p=new pentagonspace();
		//P.placement();//ctc
		PS.placement();
		pentagonspace p1=new pentagonspace();
		p1.placement();

	}

}
