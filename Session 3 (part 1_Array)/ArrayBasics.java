public class ArrayBasics {
    public static void main(String[] args) {
        
         // Declare and initialize an array containing student names
        String [] student = {"Glaica Heart", "Elaiza Belle", "Braxten Knox", "Jhon Kaizer", "John Kenneth"};

        // Declare and initialize an array containing student grades
        int [] grades = {85, 90, 78, 92, 88};

        // Display all student names using a for loop
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i]);
        }

        // Display the total number of students in the array
        System.out.println("Number of students : " + student.length);

        // Display the grade stored at index 2
        System.out.println("Grade at index 2: " + grades[2]);

        // Update the grade at index 2 from 78 to 80
        grades [2] = 80;

        // Display all updated grades
        System.out.print("Updated grades : ");
        for( int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");
        }

        // Move the cursor to the next line after printing all grades
         System.out.println();
    }
    
}
