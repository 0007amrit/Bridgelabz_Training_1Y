import java.util.Scanner;
public class Kmtomiles {
    public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of KM : ");
     double K= sc.nextInt();
     double Miles = K * 0.621371;
     System.out.println("The value of KM into miles : "+Miles);
    }
    
}
