package library;
import java.util.Scanner;
public class Book 
{
	public int sNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyTotal;
    Scanner sc = new Scanner(System.in);
    public Book()
    {
    System.out.println("Enter Serial No of Book:");
    sNo = sc.nextInt();
    System.out.println("Enter Book Name:");
    bookName = sc.next();
    System.out.println("Enter Author Name:");
    authorName = sc.next();
    System.out.println("Enter Quantity of Books:");
    bookQty = sc.nextInt();
    bookQtyTotal = bookQty;
    }
}
