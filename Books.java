package library;
import java.util.Scanner;
public class Books{
Book theBooks[] = new Book[15]; 
public int count;    
Scanner sc = new Scanner(System.in);
	public int compareBook(Book b1, Book b2)
	{
    if (b1.bookName.equalsIgnoreCase(b2.bookName)){
        System.out.println("Book of this Name Already Exists.");
        return 0;
    }
    if (b1.sNo==b2.sNo){
        System.out.println("Book of this Serial No Already Exists.");
        return 0;
    }
    return 1;
}
	public int addBook(Book b){
    for (int i=0; i<count; i++){
        if (compareBook(b,theBooks[i]) == 0)
            return 0;
    }
    if (count<15){
        theBooks[count] = b;
        count++;
    }
    else{
        System.out.println("No Space to Add More Books.");
    }
	return 0;
	}
	public void displayAllBooks(){
    System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
    System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
    for (int i=0; i<count; i++){
        System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + 
                theBooks[i].bookQtyTotal + "\t\t" + theBooks[i].bookQty);
    }
	}
	public void increaseBookQty(){
    System.out.println("\t\t\t\tINCREASE QUANTITY OF BOOK\n");
    System.out.println("Enter Serial No of Book");
    int sNo = sc.nextInt();
    for (int i=0; i<count; i++){
        if (sNo == theBooks[i].sNo){
            System.out.println("Enter No of Books to be Added:");
            int addingQty = sc.nextInt();
            theBooks[i].bookQty += addingQty;
            theBooks[i].bookQtyTotal += addingQty;
            return;
       }
    }
	}
	public void displayMenu(){
    System.out.println("----------------------------------------------------------------------------------------------------------");
    System.out.println("1. Add new Book.");
    System.out.println("2. Increase Quantity of a Book.");
    System.out.println("3. Show All Books.");
    System.out.println("4. Register Student.");
    System.out.println("5. Show All Registered Students.");
    System.out.println("6. Issue Book. ");
    System.out.println("0. Exit");
	}
	public int availableBook(int sNo){
    for (int i=0; i<count; i++){
        if (sNo == theBooks[i].sNo){
            if(theBooks[i].bookQtyTotal > 0){
                System.out.println("Book is Available.");
                return i;
            }
            System.out.println("Book is Unavailable");
            return 2;
        }
    }
    System.out.println("No Book of Serial Number " + " Available in Library.");
    return 2;
	}
	public Book issueBook(){
    System.out.println("Enter Serial No of Book to be Checked Out.");
    int sNo = sc.nextInt();
    int bookIndex =availableBook(sNo);
    if (bookIndex!=2){
        theBooks[bookIndex].bookQtyTotal--;
       return theBooks[bookIndex];
    }
    return null;
	}
}