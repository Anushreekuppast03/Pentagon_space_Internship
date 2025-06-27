package in.ps.jdbcsteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDATA {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/PENTAGON";
		String user="root";
		String password="Anu@2003";
		String query="select * from student";
		
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection(url,user,password);
	       stmt=con.createStatement();
	    
	
	
	 rs =stmt.executeQuery(query);
	 while (rs.next()) {
		 int sid =rs.getInt(1);
		 String sname = rs.getString(2);
		 long phone=rs.getLong(3);
		 String mail = rs.getString(4);
		 String branch = rs.getString(5);
		 String loc= rs.getString(6);
		 System.out.println("("+sid+" "+sname+" "+phone+" "+mail+" "+branch+" "+loc+")");
	 }
	}	     
	
catch(ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
}
}