/*Create a program to calculate the profit and loss in number and percentage based on the
cost price of INR 129 and the selling price of INR 191.
Hint =>
a. Use a single print statement to display multiline text and variables.
b. Profit = selling price - cost price
c. Profit Percentage = profit / cost price * 100*/

import java.util.Scanner;
public class Profit{
public static void main(String arg[]){
Scanner P = new Scanner(System.in);
System.out.println("Enter the cost price ");
int c = P.nextInt();
System.out.println("Enter the selling  price ");
int s = P.nextInt();
int pro = s-c;
double perpro=pro*100/c;
System.out.println("The Cost Price : "+c);
System.out.println("The Selling Price :  "+s);
System.out.println("PROFIT : "+pro);
System.out.println("PROFIT % : "+perpro);


}}