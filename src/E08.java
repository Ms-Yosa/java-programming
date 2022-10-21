import java.time.LocalDateTime;
import java.util.Scanner;

public class E08 {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a month number (1-12): ");
//        int monthNumber = sc.nextInt();

        var now = LocalDateTime.now(); // numeric value
        int monthNumber  = now.getMonthValue(); // returns 10 for october



//        String message;
//
//        if(monthNumber<1 || monthNumber > 12){
//            message = "Not valid beh";
//        } else if (monthNumber<=3) {
//            message ="That's in Q1";
//        }else{
//            message = "hays";
//        }

        System.out.println(monthNumber);


    }
}
