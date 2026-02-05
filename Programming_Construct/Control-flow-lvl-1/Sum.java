import java.util.Scanner;
public class Sum {
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value for sum :");
       double s=sc.nextDouble();
       double total =0.0;
       while(s!=0){
        total+=s;

        System.out.println("Enter the number (put 0 to stop) : ");
        s=sc.nextDouble();
       }
       System.out.println("The sum : "+total);
    }
    
}
