package in.ps.jdbcsteps;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class signup {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		String url="jdbc:mysql://localhost:3306/clg";
		String user="root";
		String password="Anu@2003";
		String querry="INSERT INTO STUDENT1 VALUES(0,?,?,?,?,?,?,SYSDATE())";
		//String querry="Select* from student1 where mail=? and password1=?";
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
		    ps=con.prepareStatement(querry);
			System.out.println("enter name");
			String sname=sc.next();
			System.out.println("enter phone");
			long phone=sc.nextLong();
			System.out.println("enetr mail");
			String mail=sc.next();
			System.out.println("enter branch");
			String branch=sc.next();
			System.out.println("enter loc");
			String loc=sc.next();
			System.out.println("enter password");
			String password1=sc.next();
			System.out.println("enter confirm password");
			String conf=sc.next();
			if(password1.equals(conf)) {
				ps.setString(1,sname);
				ps.setLong(2, phone);
				ps.setString(3, mail);
				ps.setString(4, branch);
				ps.setString(5,loc);
				ps.setString(6, conf);
				int res=ps.executeUpdate();
				if(res>0) {
					System.out.println("data added succ");
					
				}
				else {
					System.out.println("not added");
				}
			}
				else {
					System.out.println("pass mismatch");
				}
				
			
	
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}