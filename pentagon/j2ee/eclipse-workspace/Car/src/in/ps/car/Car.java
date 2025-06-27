package in.ps.car;

public class Car {
public static Engine getCar( String in) {
	
	if(in.equalsIgnoreCase("Cng")){
		return new Cng();
		}
		else if(in.equalsIgnoreCase("Diesel")){
		return new Diesel();
		}
		else if(in.equalsIgnoreCase("Petrol")){
		return new Petrol();
		}
		else{
		System.out.println("No  engine will not run");
		return null;
		}
}
}
