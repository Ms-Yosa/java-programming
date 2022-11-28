import java.util.Locale;

public class E05 {
    public static void main (String[] args){
        String message = "     Hello World";
        System.out.println(message);

        //concat
        System.out.println(message + "!!");

        //dot operator
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("r"));
        System.out.println(message.replace("H", "Ny")); // parameters = target, replacement ; args = H, Nye
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());




    }
}
