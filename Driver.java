//import java.lang.*;
import java.util.Scanner;
//import java.sql.*;
public class Driver {
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
			default:
					System.out.println("Invalid choice.");
			}
			//sc.close();
		}while(choice!=0&&choice<5);
	}
}
