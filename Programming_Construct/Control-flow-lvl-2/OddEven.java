import java.util.Scanner;

class OddEven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a Natural Number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a positive natural number!");
        } else {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
    }
}
