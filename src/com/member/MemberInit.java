package com.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.ex.weather.Weather;

public class MemberInit {

	private String members;
	private Scanner sc;
	private Member m;

	public MemberInit() {

		sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer();
		sb.append("iu, iu, iu, 26, 1,");
		sb.append("choa, choa, choa, 30, 2,");
		sb.append("suji, suji, suji, 23, 2,");
		sb.append("hani, hani, hani, 15, 0,");

		members = sb.toString();
	}

	// 메서드명 setMember 리턴은 멤버들 MAP으로
	// 키는 id, 밸류는 member

	public HashMap<String, Member> setMember() {

		HashMap<String, Member> map = new HashMap<String, Member>();
		StringTokenizer st = new StringTokenizer(members, ",");

		while (st.hasMoreTokens()) {

			m = new Member();

			m.setName(st.nextToken().trim());
			m.setId(st.nextToken().trim());
			m.setPw(st.nextToken().trim());
			m.setAge(Integer.parseInt(st.nextToken().trim()));
			m.setLevel(Integer.parseInt(st.nextToken().trim()));

			map.put(m.getId(), m);

		}

//		Iterator<String> it = map.keySet().iterator();
//
//		while (it.hasNext()) {
//
//			String key = it.next();
//			Member value = map.get(key);
//			System.out.println("아이디 : " + value.getId());
//			System.out.println("비밀번호 : " + value.getPw());
//			System.out.println("이름 : " + value.getName());
//			System.out.println("레벨 : " + value.getLevel());
//			System.out.println("==========================");
//
//		}

		return map;

	}

	public Member memberJoin() {

		Member m = new Member();

		System.out.println("------ 이름을 입력하세요");
		m.setName(sc.next());

		System.out.println("------ 아이디를 입력하세요.");
		m.setId(sc.next());

		System.out.println("------ 비밀번호를 입력하세요");
		m.setPw(sc.next());

		System.out.println("------ 나이를 입력하세요");
		m.setAge(sc.nextInt());

		System.out.println("------ Level을 입력하세요");
		m.setLevel(sc.nextInt());

		return m;
	}

	public Member memberLogin(HashMap<String, Member> map) {

		Member member = null;

		System.out.println("------ID : ");
		String id = sc.next();

		System.out.println("------PASSWORD : ");
		String pw = sc.next();

		member = map.get(id);

		if (member != null) {

			if (!member.getPw().equals(pw)) {

				member = null;

			}

		}

//		Iterator<String> it = map.keySet().iterator();
//
//		while (it.hasNext()) {
//
//			String key = it.next();
//
//			if (map.get(key).getId().equals(id) && map.get(key).getPw().equals(pw)) {
//
//				System.out.println();
//				System.out.println("***** 로그인성공 *****");
//
//			} else {
//
//				System.out.println("***** 로그인실패 *****");
//			}
//
//		}

		return m;
	}

	public String memberDelete(HashMap<String, Member> map) {

		System.out.println("탈퇴할 아이디를 입력");
		String id = sc.next();

		String result = "없는 아이디 입니다";

		Member member = map.get(id);

		if (member != null) {

			map.remove(id);
			result = "***** 탈퇴가 완료되었습니다 *****";

		}

//		Iterator<String> it = map.keySet().iterator();
//
//		while (it.hasNext()) {
//
//			String key = it.next();
//
//			if (map.get(key).getId().equals(id)) {
//
//				map.clear();
//				result = "***** 탈퇴가 완료되었습니다 *****";
//				break;
//
//			}
//
//		}

		return result;
	}

}
