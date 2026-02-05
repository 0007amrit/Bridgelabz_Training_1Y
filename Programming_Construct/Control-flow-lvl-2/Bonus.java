/*Create a program to find the bonuses of employees based on their years of service.
Hint =>
a. Zara decided to give a bonus of 5% to employees whose year of service is more than 5
years.
b. Take salary and year of service in the year as input.
c. Print the bonus amount. */
import java.util.Scanner;
class Bonus{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year of Service : ");
        int yr=sc.nextInt();
        double Bonused_Amt;
        if(yr>5){
            System.out.println("Enter the Salary of Employee (in ₹ ): ");
            double Salary=sc.nextDouble();
            Bonused_Amt=Salary*(5.0/100.0);
            System.out.println("The Bonus Amount : "+Bonused_Amt);

            
        }
        else{
            System.out.println("Not Eligible for bonus ");
        }
    }
}