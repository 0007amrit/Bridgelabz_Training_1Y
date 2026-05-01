package Q_2;


public class Test {
    public static void main(String[] args) {

        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println("Student: " + student.getFirst() + ", Age: " + student.getSecond());


        Pair<Double, Boolean> result = new Pair<>(95.5, true);
        result.display();
    }
}