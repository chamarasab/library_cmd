import java.util.Date;

class Loan{
    private Date dateBorrowed;
    private Date dateDue;
    private Date dateReturned;
    private double fine;
    private int bookNo;
    protected int b_idNo;
    protected int l_idNo;

    public Loan() {
        
    }
    public Date getDateBorrowed() {
        return dateBorrowed;
    }
    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }
    public Date getDateDue() {
        return dateDue;
    }
    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }
    public Date getDateReturned() {
        return dateReturned;
    }
    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }
    public double getFine() {
        return fine;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
    public int getBookNo() {
        return bookNo;
    }
    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
    public int getB_idNo() {
        return b_idNo;
    }
    public void setB_idNo(int b_idNo) {
        this.b_idNo = b_idNo;
    }
    public int getL_idNo() {
        return l_idNo;
    }
    public void setL_idNo(int l_idNo) {
        this.l_idNo = l_idNo;
    }

    public void display(){

        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_CYAN = "\u001B[36m";

        System.out.println(ANSI_YELLOW+"\n\tBorrowed Books Details");
        System.out.println(ANSI_CYAN+"Book No.               : " + getBookNo());
        System.out.println("Borrower Id            : " + getB_idNo());
        System.out.println("Borrowed Date          : " + getDateBorrowed());
        System.out.println("Due Date               : " + getDateDue());
        System.out.println("Librarian at Borrowing : " + getL_idNo());
        System.out.println("Returned Date          : " + getDateReturned());
        //System.out.println("Librarian at Returning : " + getL_idNo());
        System.out.println("Fine                   : " + getFine() + ANSI_RESET);
    }
    
}
