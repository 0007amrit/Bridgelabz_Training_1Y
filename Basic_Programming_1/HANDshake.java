/*program to find the maximum number of handshakes among N number of students.
a. Get integer input for numberOfStudents variable.
b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of
possible handshakes.
c. Display the number of possible handshakes.*/
import java.util.Scanner;
public class HANDshake {
    public static void main(String arg[]){
        Scanner ns=new Scanner(System.in);
        System.out.println("Enter the number of Students : ");
        int n=ns.nextInt();
        int ph=(n * (n - 1)) / 2;
        System.out.println(" The number of possible handshakes : "+ph);
    }
}
