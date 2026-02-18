
import java.util.Scanner;

//if else
//else if
//switch
//break
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        // if (age > 18) {
        //     System.out.println("adult");
        // } else
        //     System.out.println("not adult");
        // if (age % 2 == 0) {
        //     System.out.println("even number");
        // } else
        //     System.out.println("odd number");

            //switch
switch (age) {
    case 1:
        System.out.println("hello");
        break;
        case 2:
            System.out.println("byee");
            break;
    default:System.out.println("ivalid number");
        
}

    }
}
