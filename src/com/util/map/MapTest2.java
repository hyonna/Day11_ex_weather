package com.util.map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {

		// 반복자, 열거형

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);

		Iterator it = ar.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(5, 10);
		map.put(6, 20);
		map.put(7, 30);

		Iterator<Integer> it2 = map.keySet().iterator();

		while (it2.hasNext()) {

			int key = it2.next();
			int value = map.get(key);
			System.out.println(value);

		}
		
		Hashtable<String, String> hs = new Hashtable<String, String>();
		hs.put("t1", "26");
		hs.put("t2", "30");
		hs.put("t3", "20");
		
		
		Enumeration<String> en = hs.keys();
		
		while(en.hasMoreElements()) {
			
			String k = en.nextElement();
			System.out.println(hs.get(k));
			
		}
		
		

	}

}
