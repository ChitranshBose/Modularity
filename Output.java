import java.sql.*;
//import java.util.Scanner;
public class Output extends Driver{
	public void Report(){
        try{
        	Class.forName("com.mysql.jdbc.Driver");
			System.out.println("waiting");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_employees","root","cb#0211#");
			Statement st=con.createStatement();
        	System.out.println("*************Welcome To Reporting Module***************");
        	System.out.println("the data is:");
			disp="select * from employee;";
			ResultSet rs=st.executeQuery(disp);
			System.out.println("  NAME  |ACCOUNT NUMBER| AGE | SALARY |  DOB  |  DOJ  |PHONE NUMBER");
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" |");
				System.out.print(rs.getInt(2)+" |");
				System.out.print(rs.getInt(3)+" |");
				System.out.print(rs.getInt(4)+" |");
				System.out.print(rs.getString(5)+" |");
				System.out.print(rs.getString(6)+" |");
				System.out.print(rs.getString(7)+" |");
			}
        }
        catch(Exception e){
        	System.out.println("Records not found");
        }
	}
}
