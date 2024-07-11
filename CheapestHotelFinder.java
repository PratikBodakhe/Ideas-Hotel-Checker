package com.hotels.hotelfinder;

import java.util.List;

public class CheapestHotelFinder {
	/**
	 * Finds the cheapest hotel from the given list of hotels.
	 * 
	 * @param hotels
	 *            The list of hotels.
	 * @return The name of the cheapest hotel.
	 */
	public String getCheapestPrice(List<Hotel> hotels) {
		Hotel cheapestHotel = null;

		double minPrice = Double.MAX_VALUE;
		for (Hotel hotel : hotels) {
			double price = hotel.getPrice();
			int rating = hotel.getRating();
			if (minPrice > price) {
				minPrice = price;
				cheapestHotel = hotel;
			} else if (minPrice == price) {
				if (rating > cheapestHotel.getRating()) {
					minPrice = rating;
					cheapestHotel = hotel;
				}
			}
		}

		return cheapestHotel.getName();
	}
}
