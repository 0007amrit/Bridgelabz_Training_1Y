/*15.program to input the unit price of an item and the quantity to be bought. Then,
calculate the total price.
I/P => unitPrice, quantity
O/P => The total purchase price is INR __, if the quantity ___ and unit price is INR__ */
import java.util.Scanner;
public class INR {
    public static void main(String arg[]){
        Scanner mrp=new Scanner(System.in);
        System.out.println("Enter the unitprice of an item : ");
        int up=mrp.nextInt();
        System.out.println("Enter the quantity of item : "); 
        int qt=mrp.nextInt();
        int pp=up*qt;
        System.out.print("The total purchase price of items is :INR ₹"+pp );
       System.out.print(" if the quantity "+qt );
     System.out.print(" and Unit Price is "+up );

    }
    
}
