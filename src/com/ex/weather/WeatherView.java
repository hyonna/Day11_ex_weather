package com.ex.weather;

import java.util.ArrayList;

public class WeatherView {
	
	public void view(String str) {
		System.out.println(str);
	}

	public void view(ArrayList<Weather> weathers) {
		for (int i = 0; i < weathers.size(); i++) {
			Weather w = weathers.get(i);
			this.view(w);
		}
	}

	public void view(Weather w) {

		System.out.println("****등록된 정보 출력****");

		System.out.println("도시명 : " + w.getCity());
		System.out.println("상태 : " + w.getState());
		System.out.println("기온 : " + w.getTem());
		System.out.println("습도 : " + w.getHum());
		System.out.println("미세먼지 : " + w.getMise());
		System.out.println("==================================");

	}

}
