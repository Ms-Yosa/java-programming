public class E14 {

// syntax error
//
    public static void main(String[] args){
        String s = "happy birthday";
        try {
            var sub = s.substring(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("not dead yet");
    }
}
