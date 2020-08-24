package moduloGenerics;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> lang = Arrays.asList ("JAVA", "T-SQL");
		List<Integer> nums = Arrays.asList (1, 2, 3);
		
		//Without generic i will need of casting
		String s = (String) MethodWithGenerics.getLastElement(lang);
		Integer i = (Integer) MethodWithGenerics.getLastElement(nums);
		System.out.println(s + " " + i);
		
		//With generic i can use without casting
		//I can be more specific like this
		String s1 = MethodWithGenerics.<String> getLastElement1(lang);
		Integer i1 = MethodWithGenerics.getLastElement1(nums);
		System.out.println(s1 + " " + i1);		
	}
}
