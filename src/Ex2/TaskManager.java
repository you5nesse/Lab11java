package Ex2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	public static void main(String[] args) {
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(new Task("Faire les exercices"));
		tasks.add(new Task("Réviser pour un examen"));
		tasks.get(0).setCompleted(true);
		for (Task t : tasks) {
			System.out.println(t);
		}
	}
}
