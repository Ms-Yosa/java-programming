import java.util.Scanner;

public class E15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);

        //.next returns string
        // token = separate by spaces

//        System.out.print("Name: ");
//        String name = scanner.next();
//        System.out.println("You are " + name);

        //.nextLine

        System.out.print("Name: ");
        String fullName = scanner.nextLine();
        System.out.println("You are " + fullName);
    }
}
