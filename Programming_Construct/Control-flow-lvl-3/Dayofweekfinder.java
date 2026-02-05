import java.util.Scanner;

class Dayofweekfinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter Day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter Year: ");
        int y = sc.nextInt();


        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        System.out.println("\nDay Number = " + d0);

        String dayName = "";

        switch (d0) {
            case 0: dayName = "Sunday"; break;
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
        }

        System.out.println("Day of Week = " + dayName);

    }
}
