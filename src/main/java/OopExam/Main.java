package OopExam;

public class Main {
    public static void main(String[] args) {

        Manager manager=new Manager(123);
        Student student=new Student(123);
        Business business=new Business("Shirt",10,15.99);
        business.setProductPrice(15.99);
        Cloth cloth=new Cloth("Pants",25.50,Size.XL);
        Cloth cloth1=new Cloth("Shirt",15.00,Size.L);
        Cloth cloth2= new Cloth("Jacket",35.00,Size.S);
        Cloth[] cloths= new Cloth[] {cloth, cloth1, cloth2};
        cloth.setName("Pants");cloth.setPrice(25.0);cloth.setSize(Size.XL);
        cloth1.setName("Shirt");cloth1.setPrice(15.0);cloth1.setSize(Size.L);
        cloth2.setName("Jacket");cloth2.setPrice(35.0);cloth2.setSize(Size.S);

        double total =calculateSubTotal(cloths);
        System.out.println("The total sum of all items are $"+total);
        student.setSize(Size.S);
        Student student1=new Student(456);
        student1.setSize(Size.XL);
        student.printUniqueStudentID();
        student1.printUniqueStudentID();
        student.printUniqueStudentID();
        printInfo(student);
        isAFit(cloth,student);







    }//PSVM
    public static double calculateSubTotal(Cloth [] cloths){
        double sum=0.0;
                for(int  i=0; i< cloths.length; i++){
                    sum +=cloths[i].getPrice();
                }return sum;
    }
    public static void printInfo(Student student ){
        student.printUniqueStudentID();
        long studentID = student.studentID;
        System.out.println("The student ID is "+studentID +"\t "+"The Shirt Size is "+student.getSize());


    }public static boolean isAFit(Cloth cloth ,Student student){
        if (cloth.getSize().equals(student.getSize())){
            System.out.println("It fits");
        }
        else {
            System.out.println("It does not fit, Get another size");
        }
     return true;
    }




}//Main

