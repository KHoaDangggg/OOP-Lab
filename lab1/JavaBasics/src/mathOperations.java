import java.util.Scanner;
public class mathOperations {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        Double num1 = keyboard.nextDouble();
        Double num2 = keyboard.nextDouble();
        System.out.print("Operation: ");
        String operation = keyboard.nextLine();
        if(operation.equals("+")){
            System.out.println("Sum: " +  (num2 + num1));
        }
        if(operation.equals("-")){
            System.out.println("Difference: " +  (num2 - num1));
        }
        if(operation.equals("*")){
            System.out.println("Product: " +  (num2 * num1));
        }
        if(operation.equals("/")){
            if(num1 == 0){
                System.out.println("Invalid divisor");
            }
            else{
                System.out.println("Division: " +  (num2/num1));
            }
        }
    }
}
