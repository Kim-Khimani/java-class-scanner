import java.util.Scanner;

public class ShoeVendor {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String name;
        String email;
        int age;
        float salary;

        System.out.println("Enter below details for Registration:");

        System.out.println("Enter your First and Last Name:");
        name=scanner.nextLine();
        System.out.println("Enter Your Email Address");
        email=scanner.nextLine();
        System.out.println("Enter your average Salary");
        salary=scanner.nextFloat();
        System.out.println("Enter Your age");
        scanner.nextInt();

        System.out.println("Thank you " + name + "for your time.Registration Successful!!");

    }
}
