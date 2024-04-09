package OopExam;

public class Student extends Customer {
    private final double discount;
    public long studentID;
    public Student(long studentID) {
        discount = .5;
        this.studentID=studentID;
    }

    public double getDiscount() {
        return discount;
    }

    public void printUniqueStudentID(){
        System.out.println("The id number is #"+ studentID);
    }
}
