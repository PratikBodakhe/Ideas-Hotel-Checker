package com.hotels.hotelfinder;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCaller {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Customer Id");
		/*
		 * Enter a customer ID which can be alpha numeric. For example : If ID starts
		 * with "REW" then customer is reward customer else will be regular customer. ID
		 * Valid input example : REW123, REG978, 4563, etc.
		 */
		String cust_id = scan.next();

		/*
		 * Enter a day of looking the hotel. 
		 * Valid input example : Monday, tuesday, SUNDAY, etc.
		 */
		System.out.println("Enter a day you are looking for");
		String bookingDay = scan.next();
		scan.close();
		ArrayList<Hotel> hotels = new ArrayList<>();

		/*
		 * expected arguments in constructor : hotelName, rating, regularWeekdayPrice,
		 * rewardWeekdayPrice,regularWeekendPrice, rewardWeekendPrice, customerId,
		 * bookingDay
		 */
		Hotel miamiBeach = new Hotel("Miami Beach", 4, 80, 50, 110, 90, cust_id, bookingDay);
		Hotel miamiDowntown = new Hotel("Miami Downtown", 3, 120, 100, 90, 80, cust_id, bookingDay);
		Hotel miamiMidtown = new Hotel("Miami Midtown", 5, 100, 70, 150, 130, cust_id, bookingDay);

		hotels.add(miamiBeach);
		hotels.add(miamiDowntown);
		hotels.add(miamiMidtown);

		String cheapestHotel = new CheapestHotelFinder().getCheapestPrice(hotels);
		System.out.println("Cheapest Hotel is : " + cheapestHotel);
	}
}
