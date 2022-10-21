public class E05 {
    public static void main(String[] args){

        // length
        var s1 = "Welcome to California";
        System.out.println(("length of string " + s1.length()));

        // position of string
       // var position = s1.indexOf("California");
        System.out.println("The position is " + s1.indexOf("California"));

        //knowing string value base on index
        System.out.println("Value in index 11 is "+ s1.substring(11));

        //remove white space
        String s2 = "Welcome!   ";
        var len = s2.length();
        System.out.println(len);// 11
        var trimmed = s2.trim();
        System.out.println(trimmed.length()); //8



    }
}
