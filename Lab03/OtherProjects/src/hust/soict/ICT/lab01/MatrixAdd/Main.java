package hust.soict.ICT.lab01.MatrixAdd;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter size of matrix: ");
       int n = keyboard.nextInt();
       double max1[]  = new double[n*n];
       double max2[]  = new double[n*n];
       System.out.println("Matrix 1:");
       for(int j=0; j<n*n; j++){
           max1[j] = keyboard.nextDouble();
       }
        System.out.println("Matrix 2:");
        for(int j=0; j<n*n; j++){
            max2[j] = keyboard.nextDouble();
        }
        System.out.println("Sum of 2 maxtrices: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((max1[i*n+j] + max2[i*n+j] )+" ");
            }
            System.out.print("\n");
        }

    }
}