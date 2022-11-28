import java.awt.*;

public class E04 {
    public static void main (String[] args){

        // primitive = allocate the point object. restore the actual values
        // reference = allocates the memory address of the object

        byte a =2;
        byte b =a;
        a=3;
        System.out.println(b);


        Point point1 = new Point(1,1);
        Point point2 = point1; // referencing the same address
        point1.x = 2;
        System.out.println(point2);

    }
}
