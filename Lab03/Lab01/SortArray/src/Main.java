import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        double sum=0;
        System.out.println("Nhap so phan tu: ");
        n = keyboard.nextInt();
        double ar[] = new double[n];
        for(int i=0; i<n; i++){
            ar[i] = keyboard.nextDouble();
            sum+=ar[i];
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(ar[i] > ar[j]){
                    double temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/n);
        for(int i=0; i<n; i++){
            System.out.print(ar[i] + " ");
        }

    }
}