// instance = object created
// class = blueprint
// behaviours = functions
// attributes = properties
// constructor = method/function to create instance ; class name = constructor name = instance name
// parameters
// non-static variables = instance variables
// static variables = variables that does not change per instance or if changed, it should affect all the instances // called using the class name



public class Triangle {

    //static variables

    static int numOfSides = 3;


    // instance variables, attribute variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // constructor (parameter)
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        // this.attribute = parameter
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }
    // function/ instance methods = non-static method
    public double findArea(){
        return (this.base * this.height)/2;
    }

}
