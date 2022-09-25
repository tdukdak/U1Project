import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Lines 8-20 ask the user for input for values such as the
        //total and tip percentage any monetary based values such as the bill are declared as doubles
        // while party size is declared an integer as you cannot have a decimal point
        // in number of people in a party
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

        //Lines 26-29 compile the information and run operations that calculate certain values
        //such as total tip which is ran through an operation that includes multiplication and division
        // the Math.round function

        double tipTotal = Math.round(((tipPercent / 100) * bill) * 100.0) / 100.0;
        double totalBill = (tipTotal + bill);
        double tipPerPerson = Math.round((tipTotal / partySize) * 100.0) / 100.0;
        double totalPerPerson = Math.round((totalBill / partySize) * 100.0) / 100.0;

        //lines 33-36 the values calculated previously are displayed using print statements.

        System.out.println("total tip: " + tipTotal);
        System.out.println("total bill: " + totalBill);
        System.out.println("tip per person: " + tipPerPerson);
        System.out.println("total per person: " + totalPerPerson);




    }
}