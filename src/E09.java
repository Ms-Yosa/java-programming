import java.time.LocalDateTime;

public class E09 {
    public static void main(String[] args){

        var now = LocalDateTime.now();
        int monthNumber = now.getMonthValue();

        switch (monthNumber) {
            case 1:
                System.out.println("Month is January");
                break;
            case 2:
                System.out.println("Month is February");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("4th quarter of the year!");
                break;
            default:
                System.out.println("Choose another month");

        }

    }
}
