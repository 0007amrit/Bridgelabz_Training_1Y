import java.util.Scanner;
public class Persq {
    public static void main(String arg[]){
        Scanner side= new Scanner(System.in);
        System.out.println("Enter the side of a square : ");
        int s=side.nextInt();
         int peri=4*s;
         System.out.print("The Length of the side is : "+s );
         System.out.print(" whose perimeter of Square is : "+peri);
    }  
}
