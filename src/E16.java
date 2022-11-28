import java.text.NumberFormat;
import java.util.Scanner;

public class E16 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double annualInterest = input.nextDouble();
        System.out.print("Period(Years): ");
        double years = input.nextDouble();

        // r = annual/100/12
        // n = period * 12
        // Math.pow()

        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        double monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double numOfPayments = years*MONTHS_IN_YEAR;
        double expression = Math.pow((1+monthlyInterestRate), numOfPayments);
        double numerator = monthlyInterestRate * expression;
        double denominator = expression - 1;
        double mortgage = principal * (numerator / denominator);


        System.out.println("Mortgage: $" + String.format("%.2f", mortgage));


    }

}
