package Ex3;
import java.util.*;

public class SetComparison {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(Arrays.asList("Java", "C++", "Python"));
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Java", "C++", "Python"));
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Java", "C++", "Python"));
        
        System.out.println("HashSet (non ordonné) : " + hashSet);
        System.out.println("LinkedHashSet (ordre d'insertion) : " + linkedHashSet);
        System.out.println("TreeSet (trié alphabétiquement) : " + treeSet);
    }
}