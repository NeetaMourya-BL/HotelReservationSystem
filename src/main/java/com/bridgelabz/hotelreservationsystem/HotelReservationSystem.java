package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;
/**
 * Hotel Reservation Program!
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class HotelReservationSystem {

	public static Map<String, Integer> hotelMap = new HashMap<>();

	public HotelReservationSystem() {

	}

	public void setRateForRegularCustomers(String hotelType, int rate) {
		hotelMap.put(hotelType, rate);
	}


	    public static void getCheaper(List<Hotel> hotelList, int dateCount) {

	     Hotel minRateHotel=hotelList.stream().min(Comparator.comparing(Hotel::getRate)).get();
	        System.out.println("Cheapest hotel :");
	        System.out.println("Hotel name "+minRateHotel.getHotelName()+", Total Rates : $"+minRateHotel.getRate()*dateCount);

	    }
	}