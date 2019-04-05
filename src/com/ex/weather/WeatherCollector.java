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

		weathers = winit.getWeathers();

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
				Weather w = winit.setWeather();
				weathers.add(w);
				break;
			case 2:
				Weather w1 = winit.findWeather(weathers);

				if (w1 != null) {

					wv.view(w1);
					
				} else {

					wv.view("찾는 도시가 없습니다");
				}

				break;
			case 3:
				String str = winit.deleteWeather(weathers);
				wv.view(str);
				break;
			case 4:
				wv.view(weathers);
				break;
			default:
				System.out.println("종료합니다");
				check = !check;

			}

		}

	}

}
