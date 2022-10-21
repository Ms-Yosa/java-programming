import java.util.Scanner;

public class E012 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i1 = getInput(sc);
        int i2 = getInput(sc);

        double result = addValues(i1,i2);
        System.out.println("The sum is " + result);

        double resultOf4 = addValues(i1,i2, i1,i2);
        System.out.println("The sum is " + resultOf4);


        double resultOfMultiple = addValues(i1,i2, i1,i2, i1,i2, i1,i2);
        System.out.println("The sum is " + resultOfMultiple);
    }

    private static int getInput(Scanner sc){
        System.out.print("Enter a numeric value: ");
        return sc.nextInt();
    }

    private static double addValues(int i1, int i2){
        return i1+i2;
    }

    private static double addValues(int i1, int i2, int i3, int i4){
        return i1+i2+i3+i4;
    }

    private static double addValues(int... values){
        int result =0;
        for (var value:values) {
            result += value;
        }
        return result;
    }

}
