public class E06 {
    public static void main(String[] args){

        Triangle triangleA = new Triangle(15, 8, 15, 8, 17); // instance 1
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3 ); // instance 2

        double triangleAArea = triangleA.findArea();
        double triangleBArea = triangleB.findArea();
        System.out.println("Triangle A area = " + triangleAArea);
        System.out.println("Triangle B area = " + triangleBArea);


        // calling non-static variables
        System.out.println(triangleA.base);
        System.out.println(triangleB.base);

        //calling static variables
        System.out.println(Triangle.numOfSides);
    }


}
