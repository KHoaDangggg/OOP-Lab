import java.util.Scanner;
public class mathOperations {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        Double num1 = Double.parseDouble(keyboard.nextLine());
        Double num2 = Double.parseDouble(keyboard.nextLine());
        System.out.print("Operation: ");
        String operation = keyboard.nextLine();
        if(operation.equals("+")){
            System.out.printf("Sum: %.2f ", (num2 + num1));
        }
        if(operation.equals("-")){
            System.out.printf("Difference: %.2f" , (num2 - num1));
        }
        if(operation.equals("*")){
            System.out.printf("Product: %.2f" , (num2 * num1));
        }
        if(operation.equals("/")){
            if(num1 == 0){
                System.out.println("Invalid divisor");
            }
            else{
                System.out.printf("Division: %.2f", num2/num1);
            }
        }
    }
}
