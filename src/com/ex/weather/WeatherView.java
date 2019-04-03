package com.ex.weather;

import java.util.ArrayList;

public class WeatherView {
	
	public void view(ArrayList<Weather> weathers) {
		
		
		System.out.println("****등록된 정보 출력****");
		
		for (int i = 0; i < weathers.size(); i++) {

			System.out.println("도시명 : " + weathers.get(i).getCity());
			System.out.println("상태 : " + weathers.get(i).getState());
			System.out.println("기온 : " + weathers.get(i).getTem());
			System.out.println("습도 : " + weathers.get(i).getHum());
			System.out.println("미세먼지 : " + weathers.get(i).getMise());
			System.out.println("==================================");

		}
		
	}

}
