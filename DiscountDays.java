package com.hotels.hotelfinder;

import java.util.ArrayList;
import java.util.List;

public enum DiscountDays {
	SATURDAY, SUNDAY;


	public static final List<String> getNonWeekDays() {
		List<String> nonWeekDays = new ArrayList<>();
		nonWeekDays.add(DiscountDays.SATURDAY.toString());
		nonWeekDays.add(DiscountDays.SUNDAY.toString());
		return nonWeekDays;
	}
}
