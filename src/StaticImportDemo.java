import java.util.Scanner;
import static java.lang.Math.*;

public class StaticImportDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Square Root: " + sqrt(b));
        System.out.println("Power: " + pow(2, 3));
        System.out.println("Maximum: " + max(10, 20));
        System.out.println("Minimum: " + min(10, 20));
        System.out.println("Absolute: " + abs(a));
    }
}