import java.util.Scanner;
public class MultiplebyWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int counter = 1;

        System.out.println("Multiples below 100:");

        while (counter < 100) {

            if (counter % number == 0) {
                System.out.println(counter);
            }

            counter++;
        }
    }
}