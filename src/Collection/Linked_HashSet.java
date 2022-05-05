package Collection;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		LinkedHashSet<Comparable> a=new LinkedHashSet<Comparable>();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(50);
		a.add('a');
		a.add("abc");
		a.add(null);
		a.add(null);
		a.size();
		System.out.println(a);
		Object arr[]=new Object[a.size()];
		a.toArray(arr);

		//		for(Object o:arr) {
		//			System.out.println(o);
		//		}
		Iterator it=a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
