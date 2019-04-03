package com.ex.weather;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherCollector {
	
	
	Scanner sc = new Scanner(System.in);
	WeatherView view = new WeatherView();
	WeatherInit winit = new WeatherInit();
	ArrayList<Weather> weathers = new ArrayList<Weather>();
	
	public void start() {
		
		winit.getWeathers();
		
		
		while(true) {
			
			System.out.println("1. 날씨 정보 추가");
			System.out.println("2. 날씨 정보 출력");
			System.out.println("3. 프로그램 종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				
				winit.setWeather();
				
				
			} else if(select == 2) {
				
				
				view.view(weathers);
				
				
			} else {
				
				System.out.println("종료합니다");
				break;
				
			}
			
			
			
		}
		
		
	}

}
