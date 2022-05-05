package Collection;

import java.util.ArrayList;
import java.util.Iterator;



public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 =new ArrayList<>();
		ArrayList<Integer> a2 =new ArrayList<>();
		a1.add(16);
		a1.add(12);
		a1.add(15);
		a1.add(27);
		a1.add(19);
		a1.add(1,19);
		a1.remove(0);
		a1.set(0, 50);
		
		a2.add(160);
		a2.add(120);
		a2.add(150);
		a2.add(270);
		a2.add(190);
		a2.add(2,270);
		a2.remove(0);
		
//		for(Integer a:a1) {
//			System.out.println(a);
//		}
//		for(Integer i=0;i<a1.size();i++) {
//			System.out.print(a1.get(i)+" ");
//		}
	
//		a1.clear();
		a1.addAll(a2);
		a1.removeAll(a2);
		System.out.println("Arrylist: "+a1);
//		for(Integer a:a1) {
//			System.out.println(a);
//		}
//		for(Integer i=0;i<5;i++) {
//		      System.out.println(a1.get(i));	
//		}
//		
	    Iterator<Integer> i=a1.listIterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	    
		
		
//		System.out.println("Arry_list: "+a1);
//		System.out.println("Arry_list: "+a2);
//		
//		System.out.println("a1 list contains 15: "+a1.contains(19));
//		System.out.println("a2 list contains 190: "+a2.contains(190));
//		System.out.println("a1 Contains all a2: "+a1.containsAll(a2));
//		System.out.println("a2 Contains all a1: "+a2.containsAll(a1));
//		
//		System.out.println("The First Occurrence of 19 in a1 at index: "+a1.indexOf(19));
//		System.out.println("The First Occurrence of 270 in a2 at index: "+a2.indexOf(270));
//		System.out.println("The Last Occurrence of 19 in a1 at index: "+a1.lastIndexOf(19));
//		System.out.println("The Last Occurrence of 270 in a2 at index: "+a2.lastIndexOf(270));
//		
		

	}

}
