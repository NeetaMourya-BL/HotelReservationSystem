package com.bridgelabz.hotelreservationprogram;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.hotelreservationsystem.Hotel;
import com.bridgelabz.hotelreservationsystem.HotelReservationSystem;

public class HotelReservationSystemTest {
	@Test
	public void givenHotelName_whenNameAndRate_shouldRerunRate() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		hotelReservationSystem.setRateForRegularCustomers("Lakewood", 90);
		// hotelReservationSystem.showHotelAndRates();
		Integer actualResult = Hotel.showRates("Lakewood");
		Integer expectedResult = 90;
		Assert.assertEquals(actualResult, expectedResult);
	}

}