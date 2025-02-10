
//first step
class Book {
    String title = "Pather Panchali";
    String author = "Bibhutibhushan Bandyopadhyay";
    String isbn = "978-81-7525-221-3";
    
    public String getDetails() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn;
    }
}


// 2nd step 
class BorrowedBook extends Book{
    String borrowerName = "miraj";
    String dueDate = "2025-03-15";
    
    public String getBorrowDetails() {
        return getDetails() + "\nBorrower: " + borrowerName + "\nDue Date: " + dueDate;
    }
}

// 3rd step 
public class Main {
    public static void main(String[] args) {
        BorrowedBook book = new BorrowedBook();
        System.out.println(book.getBorrowDetails());
    }
}