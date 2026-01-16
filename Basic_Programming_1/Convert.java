
import java.util.Scanner;
public class Convert{
public static void main(String arg[])
{
Scanner Convert = new Scanner(System.in);
System.out.println("Enter Killometer");
double k=Convert.nextInt();
double M=k*1.60;
System.out.println("The value of Miles after conversion : "+M);
}}