/*harry born in 2000 and calculate the age of harry*/
import java.util.Scanner;
class Harry {
public static void main(String arg[]){
  Scanner year = new Scanner(System.in);
  System.out.println("Enter the year when person born: ");
  int a=year.nextInt();
  System.out.println("Enter the current year : ");
  int b= year.nextInt();
  int Age =b-a;
  System.out.println("The age of the person is : "+Age);
  
  
}}