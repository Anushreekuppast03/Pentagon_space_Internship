package in.ps.jdbcsteps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/clg";
        String user = "root";
        String password = "Anu@2003";
        String query = "SELECT * FROM student1 WHERE mail = ? AND password = ?";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement(query);

            System.out.println("Enter mail:");
            String mail = sc.next();

            System.out.println("Enter password:");
            String userPassword = sc.next(); // Renamed to avoid conflict

            ps.setString(1, mail);
            ps.setString(2, userPassword);

            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful, welcome " + rs.getString(1));
            } else {
                System.out.println("Invalid mail or password.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
