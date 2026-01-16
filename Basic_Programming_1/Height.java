/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is*/
import java.util.Scanner;
public class Height {
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the height in cm : ");
    double cm=sc.nextDouble();
    double foot=(cm/2.54)/12;
    System.out.println("The Height in foot is : "+foot);


    
}}
