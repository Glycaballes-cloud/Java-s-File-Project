import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
        
        int sum = 0;
        int num; 

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextInt();
            
            sum = sum + num;
        } while (num != 0); 
        System.out.println("The final total sum is: " + sum);
        input.close();
    }
}