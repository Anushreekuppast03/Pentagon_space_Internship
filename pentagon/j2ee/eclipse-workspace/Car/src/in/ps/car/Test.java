package in.ps.car;

import java.util.Scanner;

public  class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  mode:");
		String Engine=sc.next();
		Engine ip=Car.getCar(Engine);
		if(ip!=null)
		{
		ip.doEngine();
		}
	}

}
