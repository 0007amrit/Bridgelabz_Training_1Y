package Q_1;


public class Test {
    public static void main(String[] args) {
        // 1. Storing an Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(101);
        System.out.println("Integer Value: " + intBox.get());

        // 2. Storing a String
        Box<String> stringBox = new Box<>();
        stringBox.set("Java Generics");
        System.out.println("String Value: " + stringBox.get());

        // 3. Storing a Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.99);
        System.out.println("Double Value: " + doubleBox.get());
    }
}