package hust.soict.ICT.lab01.Others;

import java.util.Scanner;
import java.lang.Math;
public class equation {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 1 to solve first degree equation");
        System.out.println("Enter 2 to solve second degree equation");
        System.out.println("Enter 3 to solve first degree equations");
        int i = kb.nextInt();
        if(i == 1){
            firstDegree();
        } else if (i == 2) {
            secondDegree();
        } else if (i == 3) {
            firstDegreeEquations();
        }
    }
    public static void firstDegree(){
        Scanner kb = new Scanner(System.in);
        System.out.println("ax + b = 0");
        System.out.println("Enter a: ");
        Double a = kb.nextDouble();
        System.out.println("Enter b: ");
        Double b = kb.nextDouble();
        if(a == 0 && b != 0){
            System.out.println("No solution");
        }
        else {
            System.out.printf("Solution: %.2f" ,-b/a);
        }
    }
    public static void secondDegree(){
        Scanner kb = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter a: ");
        Double a = kb.nextDouble();
        System.out.println("Enter b: ");
        Double b = kb.nextDouble();
        System.out.println("Enter c: ");
        Double c = kb.nextDouble();
        if(a == 0){
            if(b == 0 && c != 0){
                System.out.println("No solution");
            }
            else {
                System.out.printf("Solution: %.2f " , -c/b);
            }
            System.exit(0);
        }
        Double delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("No solution");
        } else if (delta == 0) {
            System.out.printf("Double root: %.2f", -b/(2*a));
        } else{
            System.out.printf("2 solutions are %.2f and %.2f", (-b + Math.sqrt(delta))/(2*a), (-b - Math.sqrt(delta))/(2*a) );
        }

    }
    public static void firstDegreeEquations(){
        Scanner kb = new Scanner(System.in);
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("Enter a: ");
        Double a = kb.nextDouble();
        System.out.println("Enter b: ");
        Double b = kb.nextDouble();
        System.out.println("Enter c: ");
        Double c = kb.nextDouble();
        System.out.println("Enter d: ");
        Double d = kb.nextDouble();
        System.out.println("Enter e: ");
        Double e = kb.nextDouble();
        System.out.println("Enter f: ");
        Double f = kb.nextDouble();
        if(a*d - b*c == 0){
            System.out.println("No solution");
        } else {
            System.out.printf("x = %.2f and y = %.2f", (b*f - e*d)/(a*d - b*c), (e*c - f*a)/(a*d - b*c));
        }
    }
}
