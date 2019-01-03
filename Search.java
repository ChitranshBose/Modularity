import java.sql.*;
public class Search extends Sort {
	public void searching(){
		try{
			//Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("waiting");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_employees","root","cb#0211#");
			Statement st=con.createStatement();
			System.out.println("************Welcome To Searching Module*************");
			System.out.println("1-search according to name\n2-search according to account no.");
			int choice=sc.nextInt();
			switch(choice){
				case 1:	
						System.out.println("Enter name to be searched");
						String name=sc.next();
						disp="select * from employee where emp_name="+name+";";
						ResultSet rs=st.executeQuery(disp);
						System.out.println("  NAME  |ACCOUNT NUMBER| AGE | SALARY |  DOB  |  DOJ  |PHONE NUMBER");
						while(rs.next()){
							System.out.print(rs.getString(1)+" |");
							System.out.print(rs.getInt(2)+" |");
							System.out.print(rs.getInt(3)+" |");
							System.out.print(rs.getInt(4)+" |");
							System.out.print(rs.getString(5)+" |");
							System.out.print(rs.getString(6)+" |");
							System.out.print(rs.getString(7)+" |");
						}
						break;
				case 2:
						System.out.println("Enter name to be searched.");
						int acc_no=sc.nextInt();
						disp="select * from empData where emp_acc="+acc_no+";";
						ResultSet rs1=st.executeQuery(disp);
						System.out.println("  NAME  |ACCOUNT NUMBER| AGE | SALARY |  DOB  |  DOJ  |PHONE NUMBER");
						while(rs1.next()){
							System.out.print(rs1.getString(1)+" |");
							System.out.print(rs1.getInt(2)+" |");
							System.out.print(rs1.getInt(3)+" |");
							System.out.print(rs1.getInt(4)+" |");
							System.out.print(rs1.getString(5)+" |");
							System.out.print(rs1.getString(6)+" |");
							System.out.print(rs1.getString(7)+" |");
						}
						break;
			default:
						System.out.println("Invalid Choice");
					
			}
			sc.close();
		}
		catch(Exception e){
			System.out.println("Record not found.");
		}
	}

}
