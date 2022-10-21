import java.util.Scanner;

public class E07 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter a numeric value: ");
        double num2 = scanner.nextDouble();
//        System.out.println("The answer is " + num1/num2);
        double result = num1/num2;
        System.out.println("The answer is " + result);

    }
}
