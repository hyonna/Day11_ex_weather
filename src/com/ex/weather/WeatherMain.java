package com.ex.weather;

public class WeatherMain {

	public static void main(String[] args) {
		
		
//		getWeathers를 실행 // 딱 한번 -> 실행한 결과물을 weathers에 대입
//
//		1. 날씨 정보 추가
//			setWeather호출 / 호출한 결과물을 weathers 변수에 넣기 
//
//		2. 날씨 검색
//
//		3. 날씨 삭제
//
//		4. 날씨 정보 출력
//			view호출
//		5. 종료
		
		
		WeatherCollector wc = new WeatherCollector();
		
		wc.start();

	}

}
