package Collection;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(50);
		
		a.addFirst(0);
		a.addLast(60);
		a.offerFirst(15);
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		System.out.println(a);
		

	}

}
