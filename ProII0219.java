import java.time.Year;
import java.util.Scanner;
public class ProII0219 {
     public static void main(String[] args) {
             Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your year of birth: ");
        int birthYear = input.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Welcome " + name + " you are " + age);

        input.close();
    

    }
}
