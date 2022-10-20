

public class E01 {

    public static void main (String[] args){
        int result = 10 + 12;
        String answer =  "The answer is " + result;
        System.out.println(answer);

        String howMany = 20 + " things";
        System.out.println(howMany);

        // int to string
        int intValue = 42;
        String newString = Integer.toString(intValue);
        System.out.println(newString);

        //boolean to string
        boolean boolValue = true;
        String stringVal = Boolean.toString(boolValue);
        System.out.println(stringVal);



        char newStringChar = newString.charAt(1);
        System.out.println(newStringChar);

        char stringValChar = stringVal.charAt(3);
        System.out.println(stringValChar);



    }
}
