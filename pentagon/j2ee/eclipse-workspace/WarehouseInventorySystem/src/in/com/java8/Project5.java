package in.com.java8;



interface VTU_MYSORE{
	int total_branch_count=10;
	default void cse_fee() {
		System.err.println("80k");
		System.out.println(total_branch_count);
		Drives_count();
		Drives_count1();
	}
	//java-9
	static void Location() {
		
		System.out.println("mysore");
		System.out.println(total_branch_count);
		//Drives_count();
		Drives_count1();
	}
	private void Drives_count() {
		System.out.println(total_branch_count);
		System.out.println("20 Drives conducted in 2023");
		
	}
	private static void Drives_count1() {
		System.out.println(total_branch_count);
		System.out.println();
		
	}
}
	class MYSORE implements VTU_MYSORE{
		
	}
		
	
	
public class Project5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VTU_MYSORE v=new Mysore();
		//v.cse_fee();
		//v.Location();//CTE
		VTU_MYSORE.Location();
//		v.Drives_count();//CTE
//		VTU_MYSORE.Drives_count1();//CTE

	}

}
