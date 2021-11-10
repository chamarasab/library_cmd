import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Borrower extends Person {
    private String status;
    private int noOfBooksAllowed;
    private int noOfBooksBorrowed;

    public int getId() {
        return super.idNo;
    }

    public void setId(int id) {
        super.idNo = id;
    }

    public String getName() {
        return super.name;
    }
    public void setName(String name) {
        super.name = name;
    }

    public String getAddress() {
        return super.address;
    }
    public void setAddress(String address) {
        super.address = address;
    }

    public String getDOB() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        return dateFormat.format(super.dateOfBirth);
    }
    public void setDateOfBirth(String date) {
        
        try {
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            super.dateOfBirth = date1;
        } catch (ParseException e) {
            
            e.printStackTrace();
        }    
        
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getNoOfBooksAllowed() {
        return noOfBooksAllowed;
    }
    public void setNoOfBooksAllowed(int noOfBooksAllowed) {
        this.noOfBooksAllowed = noOfBooksAllowed;
    }

    public int getNoOfBooksBorrowed() {
        return noOfBooksBorrowed;
    }
    public void setNoOfBooksBorrowed(int noOfBooksBorrowed) {
        this.noOfBooksBorrowed = noOfBooksBorrowed;
    }

    public void registerDetails(){
        System.out.println("\n\n");
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Address : " + getAddress());
        System.out.println("DOB : " + getDOB());
        System.out.println("Status : " + getStatus());
        System.out.println("No Of Books Allowed Maximum : " + noOfBooksAllowed);
    }
    
}
