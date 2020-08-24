package m4Collections;

import java.util.HashSet;
import java.util.Set;

public class SetHeterogenio {

	@SuppressWarnings({ "rawtypes", "unchecked" }) //suppressing errors to this exercise
	
	public static void main(String[] args) {
		//"HashSe" is a version of collection "Set"
		HashSet het = new HashSet();
		
		//adding elements 
		het.add(0.5); //automatic type casting  
		het.add(true);
		het.add("teste");
		het.add(3);
		het.add('x');
		
		System.out.println("Size is: " + het.size());
		
		//removing elements
		het.remove('x');
		System.out.println("now size is: " + het.size());
		System.out.println(het.remove('x')); //here, will be returned "true" or "false"
		
		//checking the elements inside of "het"
		System.out.println(het.contains(3));
		System.out.println(het.contains("teste"));
		
		//too we can create a collection like this
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(het);
		System.out.println(nums);
		
		//union between collections 
		//nums.addAll(het);
		//System.out.println(nums);
		
		//intersection 
		nums.retainAll(het);
		System.out.println(nums);
		
	}
}
