package hust.soict.ICT.lab01.JavaBasics;

import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you(m)?");
        Double dHeight = keyboard.nextDouble();

        //Similar to other datas
        //nextByte(), nextShort(), nextLong()
        //nextFloat(), nextBoolean()
        System.out.println("Mrs/Mr. " + strName + ", " + iAge + "years old. " +
                "Your height is " + dHeight + ".");
    }
}
