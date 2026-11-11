package Ex4;

import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        
        dictionary.put("Fish", "Poisson");
        dictionary.put("dog", "chien");
        dictionary.put("Horse", "Cheval");
        
        System.out.println("Traduction de 'dog' : " + dictionary.get("dog"));
        System.out.println("--- Dictionnaire complet ---");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}