package com.hotels.hotelfinder;

public class Hotel implements HotelProperties {

	private String hotelName;
	private int rating;
	private String customerId;
	private String bookingDay;
	private double regularWeekdayPrice;
	private double rewardWeekdayPrice;
	private double regularWeekendPrice;
	private double rewardWeekendPrice;

	public Hotel(String hotelName, int rating, double regularWeekdayPrice, double rewardWeekdayPrice,
			double regularWeekendPrice, double rewardWeekendPrice, String customerId, String bookingDay) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.customerId = customerId;
		this.bookingDay = bookingDay;
		this.regularWeekdayPrice = regularWeekdayPrice;
		this.rewardWeekdayPrice = rewardWeekdayPrice;
		this.regularWeekendPrice = regularWeekendPrice;
		this.rewardWeekendPrice = rewardWeekendPrice;
	}

	@Override
	public double getPrice() {
		// Check if the booking day is a non-weekend day (Monday to Thursday)
		if (DiscountDays.getNonWeekDays().contains(bookingDay.toUpperCase())) {
			// If it's a non-weekend day, check the customer type
			// If the customer ID starts with "REW" (case-insensitive), return the reward
			// weekday price, Otherwise, return the regular weekday price
			return customerId.toLowerCase().startsWith("rew") ? rewardWeekendPrice : regularWeekendPrice;

		} else {
			// If it's a weekend day (Friday to Sunday), check the customer type
			// If the customer ID starts with "REW" (case-insensitive), return the reward weekend price
			// Otherwise, return the regular weekend price
			return customerId.toLowerCase().startsWith("rew") ? rewardWeekdayPrice : regularWeekdayPrice;
		}
	}

	@Override
	public int getRating() {
		return rating;
	}

	@Override
	public String getName() {
		return this.hotelName;
	}

}
