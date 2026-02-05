import java.util.Scanner;
public class Sum2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        double total=0.0;
        
        if(a>0&&a!=0){
        total+=a;

        System.out.println("Enter the value (put 0 to stop) : ");
        a=sc.nextInt();
        
    }
    else{
        ;

    }
            System.out.println("The Sum  : "+total);

}
}