package com.collectionframeworks;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(881, "Gopinath Popuru");
		tmap.put(882, "Nishanth Reddy Bandala");
		tmap.put(883, "Samrat Nambara");
		tmap.put(884, "ManiRam Pulipati");
		tmap.put(885, "Naveen Pathuri");
		tmap.put(886, "PurnaChander Manda");
		tmap.put(887, "Badri Bolnedi");
		tmap.put(888, "Anil Unnam");
		
		for(Iterator<Entry<Integer, String>> iterator = tmap.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
				
	}
}
