package com.ex.weather;

import java.util.ArrayList;
import java.util.Scanner;

import com.ex.weather.*;

public class WeatherInit {

	private String info;

	public WeatherInit() {

		info = "seoul, 맑음, 10, 20, 0.3, daejeon, 비, 22, 50, 0.1, incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";

	}

	public ArrayList<Weather> getWeathers() {


		ArrayList<Weather> weathers = new ArrayList<Weather>();
		info = info.replace("-", ",");
		String[] infos = info.split(",");

		for (int i = 0; i < infos.length; i = i + 5) {

			Weather w = new Weather();

			w.setCity(infos[i].trim());
			w.setState(infos[++i].trim());
			w.setTem(Integer.parseInt(infos[++i].trim()));
			w.setHum(Integer.parseInt(infos[++i].trim()));
			w.setMise(Double.parseDouble(infos[++i].trim()));

			weathers.add(w);

		}

		for (int i = 0; i < weathers.size(); i++) {

			System.out.println("도시명 : " + weathers.get(i).getCity());
			System.out.println("상태 : " + weathers.get(i).getState());
			System.out.println("기온 : " + weathers.get(i).getTem());
			System.out.println("습도 : " + weathers.get(i).getHum());
			System.out.println("미세먼지 : " + weathers.get(i).getMise());
			System.out.println("==================================");

		}

		return weathers;

	}

	public Weather setWeather() {

		ArrayList<Weather> weathers = new ArrayList<Weather>();
		Weather w = new Weather();

		Scanner sc = new Scanner(System.in);

		System.out.println("도시를 입력하세요");
		String city = sc.next();
		w.setCity(city);

		System.out.println("상태를 입력하세요");
		String state = sc.next();
		w.setState(state);

		System.out.println("기온을 입력하세요");
		int tem = sc.nextInt();
		w.setTem(tem);

		System.out.println("습도를 입력하세요");
		int hum = sc.nextInt();
		w.setHum(hum);

		System.out.println("미세먼지를 입력하세요");
		double mise = sc.nextDouble();
		w.setMise(mise);

		weathers.add(w);

		return w;
	}

//	public Weather findWeather(ArrayList<Weather> weathers) {
//
//		return weathers;
//	}
//
//	public Weather deleteWeather(ArrayList<Weather> weathers) {
//
//		return weathers;
//	}

}
