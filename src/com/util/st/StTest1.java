package com.util.st;

import java.util.StringTokenizer;

public class StTest1 {

	public static void main(String[] args) {
		
		String str = "a-b-c-d";
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			
			String s = st.nextToken();
			System.out.println(s);
			
		}
		
		str = "1 * 2 * 3 * 4";
		st = new StringTokenizer(str);
		
		while(st.hasMoreElements()) {
			
			System.out.println(st.nextToken(" * "));
			
		}
		

	}

}
