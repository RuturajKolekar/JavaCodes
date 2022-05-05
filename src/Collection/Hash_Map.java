package Collection;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();

		m.put(101, "Ruturaj");
		m.put(102, "Sagar");
		m.put(103, "Visky");
		m.put(104, "Mahya");
		m.put(105, "Rohya");
		m.put(106, "Andya");
		System.out.println(m);
		m.put(106,"Sou");
		m.put(107, "Mahya");
		System.out.println(m);

		System.out.println(m.get(101));
		m.remove(107);
		System.out.println(m);
		System.out.println(m.containsKey(107));
		System.out.println(m.containsValue("Mahya"));

		Set<Integer> keys=m.keySet();
		System.out.println(keys);
		Collection<String> values = m.values();
		System.out.println(values);
		Set<Entry<Integer, String>> entry = m.entrySet();
		System.out.println(entry);
		
		Iterator itr=entry.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry e=(Entry) itr.next();
			System.out.println(e.getKey()+"\t"+e.getValue());
		}

//		for(Map.Entry e:entry) {
//			System.out.println(e);
//
//			System.out.println(e.getKey()+"\t"+e.getValue());
//			System.out.println();
//		}


	}

}
