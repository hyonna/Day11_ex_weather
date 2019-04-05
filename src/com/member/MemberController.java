package com.member;

import java.util.HashMap;
import java.util.Scanner;

public class MemberController {

	private Scanner sc;
	private MemberInit mi;
	private MemberView mv;
	private HashMap<String, Member> map;

	public MemberController() {

		sc = new Scanner(System.in);
		mi = new MemberInit();
		mv = new MemberView();
		map = new HashMap<String, Member>();
	}

	public void start() {

		map = mi.setMember();

		boolean check = true;

		while (check) {

			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
//			System.out.println("3. 회원탈퇴");
//			System.out.println("4. 회원 전체 정보");
			System.out.println("5. 종료");
			int select = sc.nextInt();

			if (select == 1) {

				Member m = mi.memberJoin();
				map.put(m.getId(), m);
				System.out.println();

			} else if (select == 2) {

				Member m2 = mi.memberLogin(map);
				if (m2 != null) {

					System.out.println("로그인 성공");
					System.out.println();
					System.out.println(m2.getName() + "님 환영합니다!");
					System.out.println();

					while (check) {

						System.out.println("1. 회원탈퇴");
						System.out.println("2. 회원 전체 정보");
						System.out.println("3. 종료");
						select = sc.nextInt();

						if (select == 1) {

							String str = mi.memberDelete(map);
							mv.view(str);
							System.out.println();

						} else if (select == 2) {

							
							mv.view(map);
							System.out.println();

						} else if (select == 3) {

							System.out.println("종료");
							check = !check;

						} else {
							
							System.out.println("번호를 다시 입력해주세요");

						}

					}

				} else {

					System.out.println("로그인 실패");

				}

				System.out.println();

			} else {

				System.out.println("종료");
				check = !check;

			}

		}

	}

}
