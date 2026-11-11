package Ex5;

public class Main {
public static void main(String[] args) {
	Library lib = new Library();
    Book b1 = new Book("753-2136746802", "Java ", "Auteur ");
    lib.addBookIndexed(b1);
    
    lib.borrowBook(b1, "younesse");
    System.out.println("Livre trouvé par ISBN : " + lib.findByIsbn("753-2136746802"));
}
}
