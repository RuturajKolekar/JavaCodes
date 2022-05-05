package Collection;

import java.util.ArrayDeque;

public class Array_Deque {
	public static void main(String[] args) {
		ArrayDeque <Integer> a=new ArrayDeque<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50); 
		a.add(50);
		

		
		System.out.println(a);
		System.out.println(a.peekFirst());
		System.out.println(a.pollFirst());
		System.out.println(a);
	}
    
}
