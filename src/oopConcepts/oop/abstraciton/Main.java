package oopConcepts.oop.abstraciton;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10,20);

        System.out.println("The result is : "+ result);

        //JDBC den Abstraction ile ilgili ornek:
        // Statement --> st.execute()
    }
}
