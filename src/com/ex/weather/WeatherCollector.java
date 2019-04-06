package com.ex.weather;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherCollector {

	private Scanner sc;
	private WeatherView wv;
	private WeatherInit winit;
	private ArrayList<Weather> weathers;

	public WeatherCollector() {

		sc = new Scanner(System.in);
		wv = new WeatherView();
		winit = new WeatherInit();
		weathers = new ArrayList<Weather>();

	}

	public void start() {

		weathers = winit.getWeathers();	// weather 객체가 여러개 들어가 있는 배열

		boolean check = true;
		while (check) {

			System.out.println("1. 날씨 정보 추가");
			System.out.println("2. 날씨 정보 검색");
			System.out.println("3. 날씨 정보 삭제");
			System.out.println("4. 날씨 정보 출력");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {

			case 1:
				Weather w = winit.setWeather();	// 웨더 객체를 새로 만들어서 w 에 대입
				weathers.add(w);				// weathers Arraylist 에 추가
				break;
			case 2:
				Weather foundWeather = winit.findWeather(weathers);

				if (foundWeather != null) {
					wv.view(foundWeather);
				} else {
					wv.view("찾는 도시가 없습니다");
				}
				break;
			case 3:
				String str = winit.deleteWeather(weathers);	// str ="삭제가 완료되었습니다"
				wv.view(str);
				break;
			case 4:
				wv.view(weathers);
				break;
			default:
				System.out.println("종료합니다");
				check = !check;	//true => false;
			}

		}

	}

}
