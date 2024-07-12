package com.ideas.matchSchedule;

import java.util.ArrayList;

public class MatchSchedule {

	ArrayList<String> teams = new ArrayList<>();

	void getSchedule() {

//		char[] arr = new char[2];
//		arr[0] = 'A';
//		arr[1] = 'B';
		
		String [] arr = {"Austrelia", "India", "America"};
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println(arr[i] + " Vs " + arr[j]);
				System.out.println(arr[j] + " Vs " + arr[i]);
			}
			
		}

	}
	
	
	 public static void main(String[] args) {
		MatchSchedule s = new MatchSchedule();
		s.getSchedule();
	}

}
