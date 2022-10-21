import java.util.InputMismatchException;
import java.util.Scanner;

public class E18 {
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
            double result=0;

            switch (operand) {
                case "+" -> result = CalcHelper.addValues(num1, num2);
                case "-" -> result =CalcHelper.subtractValues(num1,num2);
                case "*" -> result =CalcHelper.multiplyValues(num1,num2);
                case "/" -> result =CalcHelper.divideValues(num1,num2);
                default -> System.out.println("Invalid Input");
            }

        System.out.println("The answer is: " + result);
        }

    private static double getInput(Scanner sc) {
        System.out.print("Enter a numeric value: ");
        var input = sc.nextDouble();
        sc.nextLine();
        return input;
    }

}
