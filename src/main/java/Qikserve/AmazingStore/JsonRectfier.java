package Qikserve.AmazingStore;

import org.json.*;

public class JsonRectfier {

	public String jrectfier(String jsonString) {

		//DANIEL'S NOTE:
		//*
		//This became necessary because the json from 
		//origin was misformed.
		//My solutions was to add a new level called "menu" that
		//would point to the array of menu items returned from the origin.
		//*
		
		jsonString = "{ \"menu\" : " + jsonString + "}";

		return jsonString;
		
	}

}


