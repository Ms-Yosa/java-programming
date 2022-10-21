import java.util.Scanner;

public class E11 {


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double d1 = getInput(sc);
        double d2 = getInput(sc);

        double result = d1/d2;
        System.out.println("The answer is " + result);
    }

    private static double getInput(Scanner sc) {
        System.out.print("Enter a numeric value: ");
        return sc.nextDouble();

    }


}
