package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	private String hotelName;
	private int weekdayRate;
	private int weekendRate;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getWeekdayRate() {
		return weekdayRate;
	}

	public void setWeekdayRate(int weekdayRate) {
		this.weekdayRate = weekdayRate;
	}

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}

	public Hotel(String hotelName, int weekdayRate, int weekendRate) {
		this.hotelName = hotelName;
		this.weekdayRate = weekdayRate;
		this.weekendRate = weekendRate;
	}

	@Override
	public String toString() {
		return "Hotel{" + "hotelName='" + hotelName + '\'' + ", weekdayRate=" + weekdayRate + ", weekendRate="
				+ weekendRate + '}';
	}

	public static Integer showRates(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}