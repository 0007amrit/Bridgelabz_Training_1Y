import java.util.Scanner;
public class GradeCalculator {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Physics Marks : ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry Marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths Marks: ");
        double maths = sc.nextDouble();


        double average = (physics + chemistry + maths) / 3;

        System.out.println("Average Percentage: " + average + "%");

        if (average >= 80) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 70) {
            System.out.println("Grade: B (Very Good)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Good)");
        } else if (average >= 50) {
            System.out.println("Grade: D (Average)");
        } else if (average >= 40) {
            System.out.println("Grade: E (Below Average)");
        } else {
            System.out.println("Grade: R (Remedial)");
        }
    }}