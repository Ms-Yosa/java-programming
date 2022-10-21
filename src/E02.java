import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class E02 {
    public static void main (String[] args){
        double doubleValue = 10_000_000.53;

//        NumberFormat numF = NumberFormat.getNumberInstance();

        var numF = NumberFormat.getNumberInstance();// automatically adds the package
        System.out.println("Number: " + numF.format(doubleValue));


        //int
        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number " + intF.format(doubleValue));

        // removed commas
        numF.setGroupingUsed(false);
        System.out.println("Number " + numF.format(doubleValue));

        //default locale formatting
        var locale = Locale.getDefault(); // package adds automatically
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number " + localeFormatter.format(doubleValue)); // basically, puts back commas

        // specific locale formatting
        var localeB = new Locale("ph", "PH"); // formatting based on Pinas
        var localeFormatterB = NumberFormat.getNumberInstance(localeB);
        System.out.println("Number " + localeFormatterB.format(doubleValue));

        //currency formatting
        var currencyFormatter = NumberFormat.getCurrencyInstance(localeB);
        System.out.println("Number " + currencyFormatter.format(doubleValue));

        // decimal formatting
        var df = new DecimalFormat("$00.00");
        System.out.println("Number " + df.format(10));



    }
}
