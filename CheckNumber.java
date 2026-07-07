import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        //To check the sign of the number and then print
        if(num > 0){
            System.out.println(" The number is positive.");
        } else if ( num < 0){
            System.out.println(" The number is negative");

        } else
            System.out.println(" The number is zero");

        // A syntax that determine the parity of the number and then print
       if(num % 2 == 0){
         System.out.println(" The number is even.");
       }else{
         System.out.println(" The number is odd.");
       }
         input.close();
    }
    
}
