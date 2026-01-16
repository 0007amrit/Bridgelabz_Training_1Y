
import java.util.Scanner;
public class Earth {
public static void main(String arg[]){
    Scanner r= new Scanner(System.in);
    System.out.println("Enter the radius of the Earth : ");
    int rad=r.nextInt();
     System.out.println("The radius is in (KM/M) : ");
     String unit=r.next();
     if(unit=='KM'){
        double vol=4.0/3.0*(3.14*rad*rad*rad);
        System.out.println("The volume of earth in cubic km is : "+vol);
     }
     else if(unit=='M'){
        double vol =(88.0/21.0)*rad*rad*rad;
        System.out.println("The volume of Earth is in cubic miles is : "+vol);

     }
}
    
}
