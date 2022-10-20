public class E06c {

public static void main (String[] args){

    StudentProfile studentA = new StudentProfile("Amelia", "Renaladi", 2022, 4.3, "PolSci"); // instance1
    StudentProfile studentB = new StudentProfile("Babse", "Whewt", 2021, 4.5, "PolSci"); // instance2

    int studentAYearToGrad = studentA.incrementExpectedGraduationYear();
    int studentBYearToGrad = studentB.incrementExpectedGraduationYear();
    System.out.println(studentAYearToGrad);
    System.out.println(studentBYearToGrad);

}
}