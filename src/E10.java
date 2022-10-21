import java.util.Arrays;

public class E10 {
    public static void main (String[] args) {
        String[] months = {
                "January", "February", "March", "April",
                "June", "July", "August", "Spectember",
                "October", "November", "December"
        };

//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        };

        //for each
//        Arrays.stream(months).forEach(System.out::println);

        //while loop
//        int whileCounter=0;
//        while(whileCounter < months.length){
//            System.out.println(months[whileCounter]);
//            whileCounter++;
//        }

        //do-while
        var doCounter=0;

        do{
            System.out.println(months[doCounter]);
            doCounter++;
        }
        while(doCounter < months.length);


    }
}
