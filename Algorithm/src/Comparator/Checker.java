package Comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;

public class Checker{

	//@Override
	/*public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		
		if(o1.score > o2.score) {
			return 1;
		}
		else if(o1.score < o2.score){
			return -1;
		}else {
			return o2.name.compareTo(o1.name);
		}
		}
	*/
	
	
	
	public  Comparator<Player> desc =	new Comparator<Player>()
			{

				@Override
				public int compare(Player o1, Player o2) {
					// TODO Auto-generated method stub
					if(o1.score > o2.score) {
						return 1;
					}
					else if(o1.score < o2.score){
						return -1;
					}else {
						return o2.name.compareTo(o1.name);
					}
		
			}
			};
			
			public static void main(String[] args){
				
				Hashtable<String, Integer> m = new Hashtable<>();
				
				m.put("MAH 1", 100);
				m.put("MAH 1", 99);
				
				for(String str: m.keySet()) {
					System.out.println(m.get(str));
				}
			}
}
