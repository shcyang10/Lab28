package com.grandcircus.Lab28.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.grandcircus.Lab28.entity.WeatherResults;

@Controller
public class WeatherController {
	RestTemplate rt = new RestTemplate();

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("table")
	public ModelAndView showWeather(@RequestParam("latitude")String lat, @RequestParam("longitude") String longit) {

		HttpHeaders headers = new HttpHeaders();

		headers.add(HttpHeaders.USER_AGENT, "Testing");

		String url = "https://forecast.weather.gov/MapClick.php?lat=" + lat + "&lon=" + longit + "&FcstType=json";
		ResponseEntity<WeatherResults> response = rt.exchange(url, HttpMethod.GET,
				new HttpEntity<String>("parameters", headers), WeatherResults.class);
		ModelAndView mv = new ModelAndView("table-list","test",response.getBody().getData().getTemperature());
		mv.addObject("weather",response.getBody().getData().getWeather());
		mv.addObject("text",response.getBody().getData().getText());
		return mv;
	}

}
