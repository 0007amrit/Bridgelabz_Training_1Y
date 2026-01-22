import java.util.Scanner;
public class Perirec {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int a = sc.nextInt();
        System.out.println("Enter the breadth :");
        int b = sc.nextInt();
        double P= 2*(a+b);
        System.out.println("The Perimeter of RECTANGLE :"+P);
    }
    
}
