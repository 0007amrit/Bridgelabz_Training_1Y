
import java.util.Scanner;
public class Rocket_launch {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Countdown : ");
        int c=sc.nextInt();
        for(int i=0 ;c>=i;c--){
            System.out.println(c);
        }
        System.out.println("Rocket launch");
      }    }