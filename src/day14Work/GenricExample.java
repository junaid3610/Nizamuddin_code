package day14Work;
import java.util.*;

public class GenricExample {
	
	void stackSample() {
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(100);
		intStack.push(213);
		intStack.push(2334);
		intStack.push(65);
		System.out.println("The Stack "+intStack);
		System.out.println("POP 1 "+intStack.pop());
		System.out.println("The Stack after pop 1 "+intStack);
		System.out.println("peek 1 "+intStack.peek());
		System.out.println("The Stack after peek 1 "+intStack);
		intStack.push(444);
		System.out.println("peek 2  "+intStack.peek());
		System.out.println("The Stack after peek 2 "+intStack);
	}
	void setSample() {
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("hello");
		stringSet.add("hi");
		stringSet.add("vanakam");
		stringSet.add("something");
		stringSet.add("world!!!!");
		stringSet.add("good night");
		for (String strl : stringSet)
		System.out.println(strl);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		GenricExample obj =new GenricExample();
		obj.setSample();
		
	}

}
