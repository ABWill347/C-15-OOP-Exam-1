package OopExam;

public class Manager extends Employee{
    private final double extraDiscount;
    private double salary;

    public Manager(double salary) {
        extraDiscount = .5;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExtraDiscount() {
        return extraDiscount;
    }
}
