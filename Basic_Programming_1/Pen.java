/*Suppose you have to divide 14 pens among 3 students equally. Write a program to find how
many pens each student will get if the pens must be divided equally. Also, find the remaining
non-distributed pens.
Hint =>
a. Use Modulus Operator (%) to find the reminder.
b. Use Division Operator to find the Quantity of pens*/
import java.util.Scanner;
public class Pen{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
System.out.println("Pens :");
int p=sc.nextInt();
System.out.println("Students :");
int s=sc.nextInt();
int  d=p%s;
double e=p/s;
System.out.println("The value of remaining pens :"+d);
System.out.println("The value of pen to each student : "+e);}}