package todayTask;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(12);
		al.add(19);
		al.add(24);
		al.add(10);
		al.add(23);
		System.out.println(al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		
		for(Integer el:al) {
			if(el%2==0)
			System.out.println(el);
		}

	}

}
