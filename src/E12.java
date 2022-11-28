public class E12 {
    public static void main(String[] args){
        // implicit casting = automatic conversion = no chance of data loss
        // byte > short > int > long > float > double

        short x =1;
        int y = x+2;
        System.out.println(y);

        //Explicit casting
        double a =1.1;
        int b = (int)a + 2;
        System.out.println(b);

        // cant cast string and numbers directly
        // use wrapper classes and parse method

        String c = "1";
        int d = Integer.parseInt(c) + 2;
        System.out.println(y);



    }
}
