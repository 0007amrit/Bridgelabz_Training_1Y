import java.util.Scanner;
public class SumNatural2 {
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int a=sc.nextInt();
    double total=0.0;
    for(int i=1;i<=a;i++){
        total+=i;
    }
    System.out.println("The Sum of natural num : "+total);

}

    
}
