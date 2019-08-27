package com.grandcircus.Lab28.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

	private ArrayList<String> temperature;
	private ArrayList<String> weather;
	private ArrayList<String> text;

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getTemperature() {
		return temperature;
	}

	public void setTemperature(ArrayList<String> temperature) {
		this.temperature = temperature;
	}

	public ArrayList<String> getWeather() {
		return weather;
	}

	public void setWeather(ArrayList<String> weather) {
		this.weather = weather;
	}

	public ArrayList<String> getText() {
		return text;
	}

	public void setText(ArrayList<String> text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", weather=" + weather + ", text=" + text + "]";
	}

}
