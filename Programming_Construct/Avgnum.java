import java.util.Scanner;
public class Avgnum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a =sc.nextInt();
        System.out.println("Enter the value of b ");
        int b =sc.nextInt();
        System.out.println("Enter the value of c ");
        int c =sc.nextInt();
        double avg= (a+b+c)/3;
        System.out.println("The average of three no. : "+avg);
    }
}