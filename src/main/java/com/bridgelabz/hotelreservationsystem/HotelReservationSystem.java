package com.bridgelabz.hotelreservationsystem;
import java.util.ArrayList;
import java.util.List;
/**
 * Hotel Reservation Program!
 *
 */
public class HotelReservationSystem {
	//Main mehtod
	public static void main(String[] args) {
	      System.out.println("Welcome to hotel reservation system program");
		  ArrayList<String> list=new ArrayList<String>();   //Creating arraylist for storing data
		  list.add("Lackwood");
		  list.add("Bridgewood");
          list.add("Ridgewood");
	      System.out.println(list);  
	}
	 private List<Hotel> hotelsList = new ArrayList<>(); 
	 public void addHotels(Hotel hotels) {
	         hotelsList.add(hotels);
	     }
	  public List<Hotel> getHotelsList() {
	         return hotelsList;
	     }
}