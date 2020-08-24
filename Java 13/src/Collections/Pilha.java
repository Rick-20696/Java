package m4Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	//The logic those members here are the same of queue
	public static void main(String[] args) {
		
		Deque<String> books = new ArrayDeque<>();
		
		//**adding**
		
		//"add" returns a value boolean
		//"push" returns a exception 
		books.add("Viagem ao centro da terra"); 
		books.add("Rosa de povo");
		books.push("Os sertões");
		
		//**catching**
		//LIFO -> Last In, First Out
		System.out.println("cacth the elements");
		System.out.println(books.peek());
		System.out.println(books.element());
		
		//**removing**
		System.out.println("\nRemoving the elements");
		System.out.println(books.poll());
		System.out.println(books.pop());
		System.out.println(books.remove());
		
		//pop and remove returns the error of exception 
		//case the stack is empty
	}
}
