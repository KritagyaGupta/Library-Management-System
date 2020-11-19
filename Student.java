package library;
import java.util.Scanner;    
public class Student extends StuDetails {
Book borrowedBooks[] = new Book[15];
public int booksCount = 0;
Scanner sc = new Scanner(System.in);
	public Student()
	{
    System.out.println("Enter First Name:");
    studentFName = sc.next();
    System.out.println("Enter Last Name:");
    studentLName = sc.next();
    System.out.println("Enter Sap ID:");
    sapId = sc.next();    
    System.out.println("Enter Course:");
    course=sc.next();   
    System.out.println("Enter Branch:");
    branch=sc.next();   
    System.out.println("Enter Roll No.:");
    rollNo=sc.next();
	}
}