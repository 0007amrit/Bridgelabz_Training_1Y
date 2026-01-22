import java.util.Scanner;
public class Factorial {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int facto=1;
        int i=1;
        while(n>=i){
            facto*=i;
            i++;
        }
        System.out.println("The factorial : "+facto);
    }
    
}
