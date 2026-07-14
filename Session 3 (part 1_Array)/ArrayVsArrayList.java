import java.util.ArrayList;
public class ArrayVsArrayList {
    public static void main(String[] args) {

        String[] promotionStudents = new String[27];

        // Add student names to the ArrayList
        promotionStudents[0] = ("Glaica Heart");
        promotionStudents[1] = ("Elaiza Belle");
        promotionStudents[2] = ("Claire Blythe");
        promotionStudents[3] = ("Glaica Heart");
       
        // Display the list of promotion students
        System.out.println("Promotion 27 Students : ");

        // Loop through the array and print only the filled elements
        for (int i = 0; i < promotionStudents.length; i++) {
           if (promotionStudents[i] != null) {
                System.out.println(promotionStudents[i]);
            }
        }

        // Create another ArrayList to store daily tasks
        ArrayList<String> task = new ArrayList<>();

        // Add tasks to the ArrayList
        task.add("Attend class");
        task.add("Complete assignment");
        task.add("Study Java");

        // Display the list of daily tasks
        System.out.println("\nDaily Tasks: ");

        // Enhanced for loop to print each task
        for (String t : task) {
            System.out.println("- " + t);
        }
    }
}
