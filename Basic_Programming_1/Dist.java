/*12 program the find the distance in yards and miles for the distance provided by user in
feets
 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is*/

import java.util.Scanner;
public class Dist {
    public static void main(String arg[]){
        Scanner d= new Scanner(System.in);
        System.out.println("Enter the distance in feet :  ");
        int distanceInFeet=d.nextInt();
        double y=distanceInFeet/3.0;
        double m=distanceInFeet/5280.0;
        System.out.println("The distance in Yard is :  "+y);
        System.out.println("The distance in Miles is :  "+m);
    }
}
