import java.util.Scanner;

public class StudentProfileInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.print("Enter your firstname: ");
        String userName = input.nextLine();

        System.out.print("Enter your Last name: ");
        String surname = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt(); 

        System.out.println("My name is " + userName + " " + surname + ". I am " + age + " years old.");

        input.close();
    }
}