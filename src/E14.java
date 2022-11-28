import java.text.NumberFormat;

public class E14 {
    public static void main(String[] args){
       NumberFormat percent =  NumberFormat.getPercentInstance();
       String result = percent.format(0.1);
        System.out.println(result);

        // method chaining
        System.out.println(NumberFormat.getPercentInstance().format(2.0));


    }
}
