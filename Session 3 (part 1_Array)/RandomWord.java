import java.util.ArrayList;
import java.util.Random;

public class RandomWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");

        Random random = new Random();

        int randomIndex = random.nextInt(words.size());
        String selectedWord = words.get(randomIndex);

        System.out.println("Selected word: " + selectedWord);
    }
    
}
