import java.util.InputMismatchException;
import java.util.Scanner;

public class E17 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        try {
            num1 = getInput(sc);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
            return;
        }
        double num2 = getInput(sc);

        System.out.print("Select an operation (+ - * /): ");
        var operand = sc.next();

        switch (operand) {
            case "+" -> addValues(num1, num2);
            case "-" -> substractValues(num1,num2);
            case "*" -> multiplyValues(num1,num2);
            case "/" -> divideValues(num1,num2);
            default -> System.out.println("wait");
        }

    }

    private static double getInput(Scanner sc) {
        System.out.print("Enter a numeric value: ");
        var input = sc.nextDouble();
        sc.nextLine();
        return input;
    }

    private static void addValues(double num1, double num2){
        double result = num1 + num2;
        System.out.println("The answer is: " + result);
    }

    private static void substractValues(double num1, double num2){
        double result = num1 - num2;
        System.out.println("The answer is: " + result);
    }

    private static void multiplyValues(double num1, double num2){
        double result = num1 * num2;
        System.out.println("The answer is: " + result);
    }

    private static void divideValues(double num1, double num2){
        double result = num1 / num2;
        System.out.println("The answer is: " + result);
    }


}
