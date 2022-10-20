public class StudentProfile {

    String studentFName;
    String studentLName;
    int yearToGraduate;
    double studentGPA;
    String studentMajor;

    //constructor
    public StudentProfile(String studentFName, String studentLName, int yearToGraduate, double studentGPA, String studentMajor){
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.yearToGraduate =+ yearToGraduate;
        this.studentGPA = studentGPA;
        this.studentMajor = studentMajor;
    }
// function
    public int incrementExpectedGraduationYear(){
        return(this.yearToGraduate+1);
    }
}
