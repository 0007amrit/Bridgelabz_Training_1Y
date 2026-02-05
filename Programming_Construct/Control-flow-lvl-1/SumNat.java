import java.util.Scanner;
class SumNat {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Natural number :  ");
        int n=sc.nextInt();
        double total=0.0;
        
         total =(n*(n+1))/2.0;
    
    System.out.println("The Sum of n natural number : "+total);
    }
}
