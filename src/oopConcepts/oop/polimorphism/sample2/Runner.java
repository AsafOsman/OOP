package oopConcepts.oop.polimorphism.sample2;

public class Runner {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name="Ogrenci";
        std1.age=18;
        std1.phoneNumber="000";

        Teacher tch1 = new Teacher();
        tch1.name = "Mirac";
        tch1.age = 41;
        tch1.phoneNumber = "111";

        printInfoForStudent(std1);
        //printInfoForStudent(tch1);

        printInfoForTeacher(tch1);

        System.out.println("Ayni sonucu tek method ve polimorphism ile yazalim");
        printInfoWithPolimorphism(tch1);
        printInfoWithPolimorphism(std1);

    }
    public static /*nesneden bagimsiz cagirilsin*/ void printInfoForStudent(Student std){
        System.out.println("name : " + std.name);
        System.out.println("age : " +std.age );
        System.out.println("phone-number : "+ std.phoneNumber);
    }

    public static /*nesneden bagimsiz cagirilsin*/ void printInfoForTeacher(Teacher tch){
        System.out.println("name : " + tch.name);
        System.out.println("age : " +tch.age );
        System.out.println("phone-number : "+ tch.phoneNumber);
    }

    public static void printInfoWithPolimorphism(User user){
        System.out.println("name : " + user.name);
        System.out.println("age : " +user.age );
        System.out.println("phone-number : "+ user.phoneNumber);
    }

    // burada child lardan tek tek cagirip bi kod kalabalıgı tekrari yapacagimiza direk parent olan user dan
    // parametre alırım ve her iki class ı bir method dan yazdırmıs olurum
}
