import java.util.Scanner;
public class gradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        gradeBook myGradeBook = new gradeBook();
        System.out.printf("initialize course name");
        myGradeBook.getBookName();
        System.out.println("insert course name ");
        String theName = input.nextLine();
        myGradeBook.setBookName(theName);
        System.out.println();
        myGradeBook.displayMessage();
    }


    }



