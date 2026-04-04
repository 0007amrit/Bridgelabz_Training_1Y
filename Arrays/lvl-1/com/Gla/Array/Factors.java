package com.Gla.Array;
import java.util.Scanner;
public class Factors {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = sc.nextInt();
          //Firstly I  init a array with max factor 10
            int mF = 10;
            int[] factors = new int[mF];
            int index = 0;

            //running a loop with if else condition and running a nested for inside cond. of if-else
            for(int i = 1; i <= number; i++) {
                if(number % i == 0) {
                    if(index == mF) {// here if number got equivalent to index
                        int[] temp = new int[mF * 2];
                        for(int j = 0; j < index; j++) temp[j] = factors[j];
                        factors = temp;
                        mF *= 2;
                    }
                    factors[index++] = i;
                }
            }
            System.out.print("Factors: ");
            for(int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }
            System.out.println();
        }
    }
