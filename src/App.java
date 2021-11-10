import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";

        
        Book book ;
        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_YELLOW + "\tWelcome to Library System\n");
        outer:
        for (int x = 1; x <= 3; x++) {
           
            System.out.println(ANSI_RED + "Press 1 to register a  new borrower");
            System.out.println("Press 2 to add new book");
            System.out.println("Press 3 to borrow book" + ANSI_RESET);
            int option1 = 0;
            
            option1 = scanner.nextInt();

            switch (option1) {
            case 1:
                System.out.println("\tRegister new borrower");
                registerBorowwer();

                break;
            case 2:
                System.out.println("\tAdd new book\n");
                addNewBook();

                break;
            case 3:
                System.out.println("\tBorrow book\n");
                
                borrowBook();
            default:
                break;
            }

            continue  outer;
        }
        //scanner.close();
    }

    private static void borrowBook() {
        int bookNo;
        int b_idNo;
        int l_idNo;
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
        Date date = new Date();  
        String today = formatter.format(date);//borrowed date

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 21);
        Date dueDate = c.getTime();
        String due = formatter.format(dueDate); // due date [+21 days]

        System.out.print("Enter User ID : ");
        b_idNo = scanner.nextInt();

        System.out.print("Enter Book ID : ");
        bookNo = scanner.nextInt();

        System.out.println("Borrowed Date : " + today);

        System.out.println("Due Date      : " + due + "\t(21 days left)");

        System.out.print("Enter Librarian ID : ");
        l_idNo = scanner.nextInt();

        Loan loan = new Loan();
        loan.setB_idNo(b_idNo);
        loan.setBookNo(bookNo);
        loan.setDateBorrowed(date);
        loan.setDateDue(dueDate);
        loan.setL_idNo(l_idNo);

        loan.display();

    }

    private static void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Enter Book No : ");
        book.setBookNo(scanner.nextInt());

        System.out.print("\nEnter Book Title : ");
        book.setTitle(scanner.next());

        System.out.print("\nEnter Book Author : ");
        book.setAuthor(scanner.next());

        System.out.print("\nEnter Book Category : ");
        book.setCategory(scanner.next());

        System.out.print("\nEnter No of Copies : ");
        book.setNoOfCopies(scanner.nextInt());

        book.displayBooks();

        //scanner.close();
    }

    private static void registerBorowwer() {
        Scanner scanner = new Scanner(System.in);
        Borrower borrower = new Borrower();

        System.out.print("\nEnter ID : ");
        borrower.setId(scanner.nextInt());

        System.out.print("\nEnter Name : ");
        borrower.setName(scanner.next());

        System.out.print("\nEnter Address : ");
        borrower.setAddress(scanner.next());

        System.out.print("\nEnter DOB [dd/MM/yyyy]: ");
        borrower.setDateOfBirth(scanner.next());

        System.out.print("\nEnter Status : ");
        String status = scanner.next();
        borrower.setStatus(status);
        if (status.equals("Child")) {
            borrower.setNoOfBooksAllowed(5);
        } else if (status.equals("Adult")) {
            borrower.setNoOfBooksAllowed(8);
        }

        borrower.registerDetails();

        //scanner.close();

        
    }
}
