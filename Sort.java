//import java.util.*;
import java.sql.*;
public class Sort extends Driver{	
	public void Sorting(){
		try{
			//ArrayList<String> al=new ArrayList<String>();
	        Class.forName("com.mysql.jdbc.Driver");
			System.out.println("waiting");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_data","root","cb#0211#");
			Statement st=con.createStatement();
	        System.out.println("*************Welcome To Sorting Module**************");
	       	System.out.println("the data is:");
			disp="select * from empData order by emp_name;";
			ResultSet rs=st.executeQuery(disp);
			System.out.println("name|emp_id|salary|email_id");
			while(rs.next()){
				//name=rs.getString(1);
				//al.add(name);
				System.out.print(rs.getString(1)+" |");
				System.out.print(rs.getInt(2)+" |");
				System.out.print(rs.getInt(3)+" |");
				System.out.print(rs.getInt(4)+" |");
				System.out.print(rs.getString(5)+" |");
				System.out.print(rs.getString(6)+" |");
			}
			/*Collections.sort(al);
			for(String str:al){
				System.out.println(str);
			}*/
		}
		catch(Exception e){
			System.out.println("The data not found.");
		}
	}
}
