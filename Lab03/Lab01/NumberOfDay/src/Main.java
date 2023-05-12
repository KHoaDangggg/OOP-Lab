import java.util.Scanner;
import java.lang.Integer;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter month: ");
        String month = keyboard.nextLine();
        System.out.print("Number of day in (month) "+ month + " is: ");
        if(month.equals("1") || month.equals("January") || month.equals("Jan") || month.equals("Jan.")
        ){
            System.out.println("31");
        }
        else if(month.equals("3") || month.equals("March") || month.equals("Mar") || month.equals("Mar.")
        ){
            System.out.println("31");
        }
        else if(month.equals("5") || month.equals("May") || month.equals("May") || month.equals("May.")
        ){
            System.out.println("31");
        }
        else if(month.equals("7") || month.equals("July") || month.equals("Jul") || month.equals("Jul.")
        ){
            System.out.println("31");
        }
        else if(month.equals("8") || month.equals("August") || month.equals("Aug") || month.equals("Aug.")
        ){
            System.out.println("31");
        }
        else if(month.equals("10") || month.equals("October") || month.equals("Oct") || month.equals("Oct.")
        ){
            System.out.println("31");
        }
        else if(month.equals("12") || month.equals("December") || month.equals("Dec") || month.equals("Dec.")
        ){
            System.out.println("31");
        }
        else if(month.equals("2") || month.equals("February") || month.equals("Feb") || month.equals( "Feb.")
        ){
            if(year%4 != 0 || (year%100 == 0 && year%400 != 0)){
                System.out.println("28");
            }
            else {
                System.out.println("29");
            }
        }
        else {
            System.out.println("30");
        }


    }
}