import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter the bill total: ");
        double bill = s.nextDouble();
        System.out.println(" ");

        System.out.print("Please enter the tip percentage you wish for: ");
        double tipPercent = s.nextDouble();
        System.out.println(" ");

        System.out.print("how many people are in your party: ");
        int partySize = s.nextInt();
        System.out.println(" ");

        double tipTotal =  (tipPercent);



    }
}