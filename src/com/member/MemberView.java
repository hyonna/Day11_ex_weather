package com.member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberView {

	public void view(String str) {

		System.out.println(str);

	}

	public void view(Member m) {

		System.out.println("=======================");
		System.out.println("아이디 : " + m.getId());
		System.out.println("비밀번호 : " + m.getPw());
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("레벨 : " + m.getLevel());
		System.out.println("=======================");

	}

	public void view(HashMap<String, Member> map) {

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next();

			Member m = map.get(key);
			this.view(m);

		}

		
	}

}
