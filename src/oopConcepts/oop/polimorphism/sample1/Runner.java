package oopConcepts.oop.polimorphism.sample1;

public class Runner {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.draw();

        //circle1 = new Triangle();
        //yukaridaki bu problemi cozmek icin 1.yol
        Square square1 = new Square();
        square1.draw();

        Triangle triangle1 = new Triangle();
        triangle1.draw();



/*
        Interfaceden nesne üretip constructor kısmını triangle veya squareden seçebiliriz
*/

        //2. yol : polimorphism
        System.out.println("************POLIMORPHISM************");
        Shape shape1 = new Triangle();
        Shape shape2 = new Square();
        Shape shape3 = new Circle();

        //Sonuc 1 =  1 degisken ile ayni turde farkli nesneleri karsiliyabiliyorum.

    }
}
