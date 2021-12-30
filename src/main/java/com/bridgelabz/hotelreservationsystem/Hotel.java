package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	public String hotelName;
	private int Rate;
	/**
	 * @param hotelName
	 * @param rate
	 */
	public Hotel(String hotelName, int rate) {
		super();
		this.hotelName = hotelName;
		Rate = rate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
}