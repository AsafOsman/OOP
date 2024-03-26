package oopConcepts.oop.inheritance.withtinheritance;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.name = "Ahmet";
        teacher1.surname = "Yemes";
        teacher1.phoneNumber = "000";
        teacher1.lesson= "Java";

        teacher1.displayLessons();


        Student student1 = new Student();
        student1.name="Veli";
        student1.surname="Kara";
        student1.phoneNumber="111";
        student1.studentNumber="111";

        student1.displayLessons();



    }
}
