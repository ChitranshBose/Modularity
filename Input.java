import java.util.Scanner;
import java.sql.*;
public class Input {
	String query,disp;
	static Scanner sc=new Scanner (System.in);
	public static void main(String args[])throws Exception{
		int choice;
		do{
			//Scanner sc=new Scanner (System.in);
			Input in=new Input();
			Output out=new Output();
			Sort sort=new Sort();
			Search search=new Search();
			System.out.println("1-INSERT MODULE\n2-REPORT MODULE\n3-SORTING MODULE\n4-SEARCHING MODULE");
			System.out.println("Enter your choice.");
			choice=sc.nextInt();
			switch(choice){
			case 1:
					in.Insert();
					break;
			case 2:
					out.Report();
					break;
			case 3:
					sort.Sorting();
					break;
			case 4:
					search.searching();
					break;
			case 5:
					System.out.println("Thank you for your time.Exit........");
					System.exit(0);
			default:
					System.out.println("Invalid choice.Try again.");
			}
			//sc.close();
		}while(choice!=0);
	}

	public void Insert(){
    	String emp_name,emp_dob,emp_doj,phone;
        int acc_num,emp_age;
        float emp_sal;
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("waiting");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_employees","root","cb#0211#");
			Statement st=con.createStatement();
			System.out.println("************WELCOME To INSERT MODULE**********");	
			System.out.println("enter name of employee");
			emp_name=sc.next();
			System.out.println("enter account no.");
			acc_num=sc.nextInt();
			System.out.println("enter age");
			emp_age=sc.nextInt();
			System.out.println("enter salary");
			emp_sal=sc.nextInt();
			System.out.println("enter date of birth");
			emp_dob=sc.next();
			System.out.println("enter date of joining");
			emp_doj=sc.next();
			System.out.println("enter the phone no.");
			phone=sc.next();
			query="insert into employee values('"+emp_name+"','"+acc_num+"','"+emp_age+"','"+emp_sal+"','"+emp_dob+"','"+emp_doj+"','"+phone+"');";
			st.execute(query);
			sc.close();
		}
		catch(Exception e){
			System.out.println("Data can not be fed.Please try again.");
       }
    }
}
