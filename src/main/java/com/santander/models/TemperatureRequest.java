package com.santander.models;

import java.util.Date;

public class TemperatureRequest {
	
	private Date date;
	private float latitude;
	private float longitude;
	private int amountOfPeople;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public int getAmountOfPeople() {
		return amountOfPeople;
	}
	public void setAmountOfPeople(int amountOfPeople) {
		this.amountOfPeople = amountOfPeople;
	}

}
