package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	public String hotelName;
	public int weekendRegularRate;
	public int weekdayRegularRate;
	/**
	 * @param hotelName
	 * @param weekendRegularRate
	 * @param weekdayRegularRate
	 */
	public Hotel(String hotelName, int weekendRegularRate, int weekdayRegularRate) {
		super();
		this.hotelName = hotelName;
		this.weekendRegularRate = weekendRegularRate;
		this.weekdayRegularRate = weekdayRegularRate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getWeekendRegularRate() {
		return weekendRegularRate;
	}
	public void setWeekendRegularRate(int weekendRegularRate) {
		this.weekendRegularRate = weekendRegularRate;
	}
	public int getWeekdayRegularRate() {
		return weekdayRegularRate;
	}
	public void setWeekdayRegularRate(int weekdayRegularRate) {
		this.weekdayRegularRate = weekdayRegularRate;
	}	
}
