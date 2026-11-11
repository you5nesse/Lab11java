package Ex1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
   public static void main(String[] args) {
	List<String> shoppingList = new ArrayList<>();
	shoppingList.add("younesse");
	shoppingList.add("ait");
	shoppingList.add("mhand");
	for(String sl : shoppingList) {
		System.out.println(sl);
	}
	shoppingList.remove("ait");
	boolean hasNom = shoppingList.contains("younesse");
	System.out.println("Contient younesse ? " + hasNom);
	System.out.println("Taille finale de la liste : " + shoppingList.size());
}
}
