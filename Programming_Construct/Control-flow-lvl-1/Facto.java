import java.util.Scanner;
public class Facto {

public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int a=sc.nextInt();
    int fac=1;
    for(int i=1;i<=a;i++){
        fac*=i;
    }
    System.out.println("The Sum of natural num : "+fac);

}

    
}
    

