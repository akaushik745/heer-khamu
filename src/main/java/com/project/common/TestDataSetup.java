package com.project.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class TestDataSetup {
	
	public static String item;
	
	
	public static String getItem() {
		return item;
	}
	
	public static void setItem(String item) {
		TestDataSetup.item = item;
	}

	
	public static String appendUniqueTxt(){
		return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar
				.getInstance().getTime());
	}

	
	public static String getUUID(){
		return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	}
	
	public static int getRandomNumberBetween(int low, int high) {
		Random r = new Random();
		return r.nextInt(high-low) + low;
	}
	
}
