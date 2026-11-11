package Ex3;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
	public static void main(String[] args) {
        String text = "souris chien chat chien oiseau chat";
        String[] wordsArray = text.split(" ");
        
        Set<String> uniqueWords = new HashSet<>();
        for (String w : wordsArray) {
            uniqueWords.add(w);
        }
        
        System.out.println("Mots uniques : " + uniqueWords);
    }
}
