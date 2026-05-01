import java.util.Scanner;

public class LicenseValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter License Plate: ");
        String plate = sc.nextLine();


        String regex = "^[A-Z]{2}[0-9]{4}$";

        if (plate.matches(regex)) {
            System.out.println(" Valid License Plate");
        } else {
            System.out.println(" Invalid License Plate");
        }

        sc.close();
    }
}