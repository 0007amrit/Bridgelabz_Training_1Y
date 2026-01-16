/*Write an IntOperation program by taking a, b, and c as input values and print the
following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also
understand the precedence of the operators.
Hint =>
a. Create variables a, b, and c of int data type.
b. Take user input for a, b, and c.
c. Compute 3 integer operations and assign the result to a variable
d. Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___*/
import java.util.Scanner;
public class Intoperation {
    public static void main(String arg[]){
        Scanner op=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a=op.nextInt();
        System.out.println("Enter the value of b : ");
        int b=op.nextInt();
        System.out.println("Enter the value of c : ");
        int c=op.nextInt();
        int q=a + b *c;
         int r= a * b + c;
        int s=c + a / b;
        int u=a % b + c;
        System.out.println("The value of a + b * c :  "+q);
        System.out.println("The value a * b + c : "+r);
        System.out.println("The value c + a / b : "+s);
        System.out.println("The value a % b + c : "+u);
    }
}
