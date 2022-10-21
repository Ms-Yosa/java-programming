public class E04 {

    public static void main(String[] args){
        String s1 ="Hello!";
        var s2 = "Hello!";

        //match
        if(s1==s2){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        String s5 = new String("HELLO!");

        var chars = s3.toCharArray();
        System.out.println(chars);

        // don't match
        if(s3==s4){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match");
        }

        // matched!
        if(s3.equals(s4)){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match");
        }

        // matched!
        if(s3.equalsIgnoreCase(s5)){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match");
        }







    }
}
