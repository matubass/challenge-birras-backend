package com.santander.services;

import com.santander.models.Temperature;
import com.santander.models.TemperatureRequest;

public class MeetService {

	public Temperature geTemperature(TemperatureRequest request) {
		Temperature temperature = new Temperature();
		Number beerQuantity;
		Number beerBoxes;
		
		// FIXME: call some API
		int dayTemp = 25;
		
		if (dayTemp >= 20 && dayTemp <= 24) {
			beerQuantity = 1;
		} else if (dayTemp < 20) {
			beerQuantity = 0.75;
		} else {
			beerQuantity = 2;
		}
		temperature.setBeerQuantity(beerQuantity);
		temperature.setTemperature(dayTemp);
		
		float amountOfPeople = (float) request.getAmountOfPeople();
		
		beerBoxes = (int) Math.ceil(amountOfPeople * (float) beerQuantity / 6);
		temperature.setBeersBoxes(beerBoxes);
		
		return temperature;
	}
}
