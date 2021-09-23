import java.util.Scanner;
public class gradeBook {
    private String bookName;

    public void setBookName(String name) {
        this.bookName = name;
    }

    public String getBookName() {
        return bookName;
    }
public  void displayMessage(){
    System.out.println("the course name is " + getBookName());
}
}

