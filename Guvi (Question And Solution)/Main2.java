import java.util.Scanner;
interface BookOperations{
    void addBook(String book);
}
interface UserOperations{
    void borrowBook(String book);
}
class Library implements BookOperations,UserOperations{
    String storebook;
    public void addBook(String book){
        storebook=book;
    }
     
    public void borrowBook(String book){
        if(storebook.equals(book)){
            System.out.println("Book added: "+book);
           // System.out.println("Book borrowed: "+book);
        }
        else{
            
            System.out.println("Book not available");
        }
    }
}
public class Main2{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String book=sc.next();
        // String cmd = sc.nextLine();        
        // String bookToBorrow = cmd.substring(7);
        Library l=new Library();
        l.addBook(book);
        l.borrowBook(book);
    }
}
