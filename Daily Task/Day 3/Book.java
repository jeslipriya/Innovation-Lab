public class Book {
    String title = "";
    String author = "";
    
    Book(){
        title = "It Ends with Us";
        author = "Colleen Hoover";
    }
    
    Book(String mytitle, String myauthor){
        this.title = mytitle;
        this.author = myauthor;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    
    public static void main(String args[]) {
        
        Book obj1 = new Book();
        obj1.displayDetails();
        
       
        Book obj2 = new Book("It", "Stephen King");
        obj2.displayDetails();
    }
}
