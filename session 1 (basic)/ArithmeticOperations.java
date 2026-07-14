import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        if(num2==0){
            System.out.println(" Division by zero is not allowed.");
            input.close();
            return;
        }

            int  sum = num1 + num2;
            int  diff = num1 - num2;
            int product = num1 * num2;
            float quotient  =(float) num1 / num2;

            System.out.println("Addition: " + sum);
            System.out.println("Subtraction: " + diff);
            System.out.println("Multiplication: " + product);
            System.out.println("Division: " + quotient);
        

         input.close();
    }
    
}