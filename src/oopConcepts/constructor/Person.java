package oopConcepts.constructor;

public class Person {

    private String name; //Zorunlu
    private String surname; //Zorunlu
    private int age; //Opsiyonel
    private int phoneNumber; //Opsiyonel

    //!! nesne olustururken zorunlu degiskenler setlenmesi gerektigi icin parametresiz const. olmamasi gerekir
    //parametreli constructor olusturmamız bu durumda zorunludur.

    // Sadece zorunlu alanlari iceren parametreli const.

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //Sadece zorunlu ve 1 opsiyonel(age) olanlari alanlari iceren parametreli const.

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    //Sadece zorunlu ve 2 opsiyonel(age , phoneNumber) olanlari alanlari iceren parametreli const.

    public Person(String name, String surname, int age, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        //Person prs1 = new Person()
        Person prs2 = new Person("Ahmet","Beyaz");
        prs2.age = 35;

        Person prs3 = new Person("Asaf","Osman",20);
    }

    //Problemin Cozumu : Builder Design Pattern
}
