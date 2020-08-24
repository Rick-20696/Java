package m4Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		//**adding**
		
		/*ADD vs OFFER 
		 *  
		 * "add" will returns "false" when the queue be restricted
		 * "offer" will throw a exception that should be treated
		 */
		queue.add("Aline");
		queue.offer("Teixeira");
		queue.add("Sousa");
		queue.offer("Ramos");
		queue.add("Barbosa");
		queue.offer("Ricardo");
		
		//**catching** 
		
		/*Peek vs Element -> catch the element, but no remove 
		 * 
		 * "peek" will returns null when a queue is empty
		 * "element" will returns a error because not exist elements in row
		 */
		System.out.println(queue.peek());
		System.out.println(queue.element());
		
		//**removing**
		
		/*FIFO -> First In, First Out: catch the element and remove 
		 * 
		 * "poll" returns "null" case the queue is empty
		 * "remove" returns error(exception) 
		 */
		System.out.println("\n" + queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		
	}
}
