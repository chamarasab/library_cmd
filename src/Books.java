class Book {
    private int bookNo;
    private String title;
    private String author;
    private String category;
    private int noOfCopies;

    public int getBookNo() {
        return bookNo;
    }
    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getNoOfCopies() {
        return noOfCopies;
    }
    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void displayBooks(){
        System.out.println("\nBook No : " + getBookNo());
        System.out.println("Book Title : " + getTitle());
        System.out.println("Book Author : " + getAuthor());
        System.out.println("Book Category : " + getCategory());
        System.out.println("No of Copies : " + getNoOfCopies());
    }
    
}
