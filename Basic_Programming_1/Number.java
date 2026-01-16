import java.util.Scanner;
class Number{
public static void main(String arg[]){
Scanner Num=new Scanner(System.in);

System.out.println("Enter the PHYSICS marks : ");
int phy=Num.nextInt();
System.out.println("Enter the CHEMISTRY  marks : ");
int chem = Num.nextInt();
System.out.println("Enter the MATHS marks : ");
int maths = Num.nextInt();

int avg = (phy+chem+maths)/3;
System.out.print("Enter the average  marks : "+avg);


}
}