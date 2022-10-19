import java.util.Scanner;
import java.lang.Math;

public class E05 {

    // void is the return type (returns nothing)
    //

    /*
    public static void announceDevTeaTime(){
        System.out.println("Waiting for dev teat time...");
        System.out.println("Type in a random word and press Enter to start dev tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's dev tea time");
    }

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Total meal price is " + result);
        return result;
    }


    public static void main (String[] args){
       double groupTotalMealPrice =  calculateTotalMealPrice(100,.20, .08);
       double portion = groupTotalMealPrice/5;
       System.out.println(portion + " each");

    }

    ----------------------------------------------------------------------------------
     public static void main (String[] args){
            double result = Math.pow(2,5);
            System.out.print(result);

     }
    ------------------------------------------------------------------------------------
     */
    // Salary Calculator
    public static void employeeGrossYearlySalary(){

        System.out.println("Enter number of hours:" );
        Scanner hoursInput = new Scanner(System.in);
        double hours = hoursInput.nextDouble();

        System.out.println("Enter amount of money: ");
        Scanner moneyInput = new Scanner(System.in);
        double money = moneyInput.nextDouble();

        System.out.println("Vacation Leave (if none, add 0): ");
        Scanner vacationLeave = new Scanner(System.in);
        int vacLeave = vacationLeave.nextInt() * 8;

        System.out.println("Calculating...");

        double deduction = vacLeave * money;
        double weekRateSalary = hours*money;
         double totalSalary = (weekRateSalary * 52) - deduction;
        System.out.println(totalSalary);

    }

    public static void main(String[] args){
        employeeGrossYearlySalary();
    }



}
