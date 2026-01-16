import java.util.Scanner;
public class Artr {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of base : ");
        int b=s.nextInt();
        System.out.println("Enter the value of height : ");
        int h=s.nextInt();
        double area=1.0/2.0*(b*h);
        System.out.println("the Area of triangle is : "+area);

    }
    
}
