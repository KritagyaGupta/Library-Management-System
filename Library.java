package library;
import java.util.Scanner;
public class Library {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("********************SVKM'S NMIMS Library!!!********************");
    System.out.println("              Please Select From The Following Options:               ");
    Books ob = new Books();
    Students objStudent = new Students();
    int choice;
    int searchChoice;
    do{
        ob.displayMenu();
        choice = sc.nextInt();

        switch(choice){
        	case 0:
        		System.out.println("You have successfully exited the application!!!");
        		break;
            case 1:
                Book b = new Book();
                ob.addBook(b);
                break;
            case 2:
                ob.increaseBookQty();
                break;
            case 3:
                ob.displayAllBooks();
                break;
            case 4:
                Student s = new Student();
                objStudent.addStudent(s);
                break;
            case 5:
                objStudent.showAllStudents();
                break;
            case 6:
                objStudent.issueBook(ob);
                break;
            default:
                System.out.println("CHOICE SHOULD BE BETWEEN 0 TO 6.");
        }
    }
    while (choice!=0);
}
}