public class E13 {
    public static void main(String[] args) {

// Passed by copy ; the method receives a copy of the args
//        int original =10;
//        System.out.println("Original before: " + original);
//        incrementValue(original);
//        System.out.println(("Original after: " + original));
//    }
//
//    private static void incrementValue(int inMethod){
//        inMethod++;
//        System.out.println("In method: " + inMethod);
//    };


// Primitive wrapped objects
// Passing by reference; the method a reference to the original object
//        int[] original ={10, 20, 30};
//        System.out.println("Original before: " + original[0]);
//        incrementValue(original);
//        System.out.println(("Original after: " + original[0]));
//    }
//
//    private static void incrementValue(int[] inMethod){
//        inMethod[0]++;
//        System.out.println("In method: " + inMethod[0]);
//    };

// Passing Immutable Values

        String original = "Original";
        System.out.println("Original before: " + original);
        changeString(original);
        System.out.println("Original after: " + original);
    };
    private static void changeString(String inMethod){
        inMethod = "New!";
        System.out.println("In method: " + inMethod);
    };


}
