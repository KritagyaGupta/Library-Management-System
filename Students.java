package library;
import java.util.Scanner;
public class Students {
Scanner sc = new Scanner(System.in);
Student theStudents[] = new Student[50];
public int count = 0;
	public void addStudent(Student s)
	{
    for (int i=0; i<count; i++){
        if(s.sapId.equalsIgnoreCase(theStudents[i].sapId)){
            System.out.println("Student of SapID " + s.sapId + " is Already Registered.");
            return;
        }
    }
    if (count<=15){
        theStudents[count] = s;
        count++;
    }
}
	public void showAllStudents(){
    System.out.println("First Name\t\tLast Name\t\tReg Number\t\tCourse\t\tBranch\t\tRollNo.");
    for (int i=0; i<count; i++){
        System.out.println(theStudents[i].studentFName + "\t\t" + theStudents[i].studentLName + "\t\t" + theStudents[i].sapId + "\t\t" + theStudents[i].course + "\t\t" + theStudents[i].branch + "\t\t" + theStudents[i].rollNo);
    }
}
	public int nStudent(){
    System.out.println("Enter Reg Number:");
    String sapId = sc.next();
    for (int i=0; i<count; i++){
        if (theStudents[i].sapId.equalsIgnoreCase(sapId)){
        	return i;
        }
    }
    System.out.println("Sorry,You are not Registered!!!");
    System.out.println("Please Register yourself first!!!");
    return 2;
}
	public void issueBook(Books book){
    int studentIndex =nStudent();
    if (studentIndex!=2){     
        Book b = book.issueBook();
        System.out.println("issuing book....");   
        if (b!= null){
                System.out.println("adding book to your account");
        }
        }
	}
}