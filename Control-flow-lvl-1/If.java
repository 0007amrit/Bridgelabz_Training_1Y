
import java.util.Scanner;
public class If {
    public static void main(String args[]){
 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int a=sc.nextInt();
    if(a%5==0){
        System.out.println("It is divisible");
    }
    else{
        System.out.println("Not divisible ");
    }
 }   
}
