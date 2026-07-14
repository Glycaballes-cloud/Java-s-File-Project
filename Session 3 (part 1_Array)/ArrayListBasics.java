import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String [] args){

        // Create an ArrayList to store course names
        ArrayList<String> courses = new ArrayList<>();

        // Add courses to the ArrayList
        courses.add("java");
        courses.add("Python");
        courses.add("Web Development");

        // Display the initial list of courses
        System.out.println("Initial courses: " + courses);

        // Add a new course to the list
        courses.add("Database");

        // Remove the course "Python" from the list
        courses.remove("Python");

        // Display the updated list of courses
        System.out.println("Updated courses: " + courses);

        // Create an ArrayList to store temperature values
        ArrayList<Integer> temp = new ArrayList<>();

        // Add temperature values to the ArrayList
        temp.add(25);
        temp.add(30);
        temp.add(22);
        temp.add(28);
        temp.add(35);

        // Display the temperature at index 1
        System.out.println("Temperature at index 1:" + temp.get(1));

        // Replace the value at index 1 with 27
        temp.set(1, 27);

        // Display the updated temperature at index
        System.out.println("Updated temperature at index 1: "+ temp.get(1));

        // Display the total number of elements in the ArrayList
        System.out.println("Size of the list: " + temp.size());

        // Display the total number of elements in the ArrayList
        System.out.println("Does list contain 30 ? " + temp.contains(30));
    }
}
