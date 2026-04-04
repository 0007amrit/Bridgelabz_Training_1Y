package com.Gla.Array;
import java.util.Scanner;
    public class ArraySumInput {
        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            double[] arr = new double[10];
            double total = 0.0;
            int index = 0;
            int i=0;
            while(true) {
                System.out.print("Enter a number (0 or negative to stop, max 10): ");
                double num = ip.nextDouble();

                if(num <= 0 || index == 10) {
                    break;
                }
                arr[index] = num;
                index++;
            }
         while(i<index){
             System.out.println("Number -> "+arr[i]);
             total +=arr[i];
             i++;

         }

            System.out.println("Sum of all numbers: " + total);
        }
    }
