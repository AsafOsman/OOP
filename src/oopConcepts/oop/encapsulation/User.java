package oopConcepts.oop.encapsulation;

public class User {

    public  String name;
    public String username;
    public int password;

    public User(String name, String username, int password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
            User user1 = new User("Ayse","Arzu",123456);
        System.out.println(user1.name);

        // istersem olusturulan bu nesnenin herhangi bir degiskenini degistirebiliirm.
        user1.name = "Mehmet";
        System.out.println(user1.name);

        // !! Ben olusturdugum bu degiskenlerin bazilarinin daha sonra degistirilmesini istemiyorsam ??
        //  Hepsinin ihtiyac aninda okunmasini ama bazilarinin degistirilmesini istemiyorsam
        // okunmasını istedigimi getter method veririm setter vermem


    }
}
