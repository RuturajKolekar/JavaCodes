package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet<Comparable> a=new HashSet<Comparable>();
		
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
