package hust.soict.ICT.lab01.TriangleDraw;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = keyboard.nextInt();
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<2*i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}