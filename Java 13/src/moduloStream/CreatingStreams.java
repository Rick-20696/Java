package moduloStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {
	
	public static void main(String[] args) {
		//All those ways are Builds of Stream
		
		//I will define a Consumer to print
		Consumer<Object> print = System.out::print;
		
		//Stream of 
		Stream<String> languages = Stream.of("Java, ", "C, ", "C#, \n");
		languages.forEach(print);
		
		System.out.println();
		
		//Passing a Array to Stream of
		String[] othersLangs= {"JavaScript, ", "Python, \n"};
		Stream.of(othersLangs).forEach(print);
		
		System.out.println();

		//Passing a Stream to array and accessing the method
		Arrays.stream(othersLangs).forEach(print);
		
		System.out.println();

		List<String> plat = Arrays.asList("Git hub ", "Android ", "Unreal \n");
		
		//Accessing of a Collection
		plat.stream().forEach(print);
		//parallel not has order, as a thread
		plat.parallelStream().forEach(print);
		
		//generate expected to receive a Supplier (Functional Interface that no has parameter)
		
		//Will generate endlessly
		//Stream.generate(() -> "a").forEach(print);
		
		//Will generate endlessly
		//Stream.iterate(0, n -> n + 1).forEach(print);
	}

}
