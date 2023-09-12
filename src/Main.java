import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = input.nextInt();
        // Variable defined, created Scanner object and injected to defined variable.

        if (year % 4 == 0) {
            System.out.println( year  + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
        // The leap year is printed on the screen.
        // According to the remainder of the entered year's division by 4.
    }
}
