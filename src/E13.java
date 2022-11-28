public class E13 {
    public static void main(String[] args){
        int result = Math.round(1.1F);
        System.out.println(result);

         // ceil = return smallest int that is greater that or equalt to the number
         int ceil = (int)Math.ceil(1.1F);
        System.out.println(ceil);

        //floor = largest int that is smaller or equal to the number
        int floor = (int)Math.floor(1.1F);
        System.out.println(floor);

        // max = returns greater of 2 values
        // min = vice versa
        int max = Math.max(1,2);
        int min = Math.min(1,2);
        System.out.println(max);
        System.out.println(min);

        //random = generates number 0-1
        int rand = (int)Math.round(Math.random() * 100);
        System.out.println(rand);

    }
}
