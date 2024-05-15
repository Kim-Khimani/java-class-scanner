import java.util.Scanner;

public class ScannerTrial2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("FIFA WORLD PLAYER OF THE SEASON");
        System.out.println("Enter the name of your player of the season");
        String name= scanner.nextLine();
        System.out.println("Enter the season the player played");
        String season = scanner.nextLine();
        System.out.println("Enter the number of goals scored in the season ...");
        int goals= scanner.nextInt();
        scanner.close();//closes the scanner class releasing resources for scanner

        System.out.println("Hello fanatic,your best footballer is " + name + "for the season running from "+ season + " with " + goals + " number of goals");
    }
}
