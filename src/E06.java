
import java.util.Scanner;

public class E06 {
    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.print("Enter number 1: ");
        var num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        var num2 = scanner.nextInt();
        System.out.println(num1 + num2);
    }
}
