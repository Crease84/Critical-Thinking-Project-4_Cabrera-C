/*
* Christopher Cabrera
* October 12, 2025
* CSUGlobal CSC320-1 Programming I
* Monthly Temps with Array
* Prints the average temperatures in Denver, CO in 2024 from a user specified month or the whole year in Fahrenheit
*/


import java.util.Scanner;

public class MonthlyTemps {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		final int NUM_MONTHS = 12;
		double yearAvg;
		boolean valid;
		int index = 0;
		String userInput = "";
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double[] temps = {28.2, 37.6, 41.4, 50.5, 56.9, 73.8, 75.7, 75.6, 70.0, 59.1, 38.2, 39.4};
		// Temperature data from National Weather Service (NWS) NOWData, NOAA Online Weather Data (https://www.weather.gov/climate/)
		
		while (!userInput.equalsIgnoreCase("Quit")) {
			yearAvg = 0;
			valid = false;
			System.out.println("Enter a month or type \"Year\" - Enter \"Quit\" to end");
			
			userInput = scnr.nextLine();
			
			if (userInput.equalsIgnoreCase("Year")) {
				for (int i = 0; i < months.length; i++) {
					System.out.println(months[i] + ": " + temps[i] + "°F");
					yearAvg = yearAvg + temps[i];
				}
				yearAvg = yearAvg / NUM_MONTHS;
				System.out.printf("Yearly Average: %.1f°F%n", yearAvg);
			}
			else if (!userInput.equalsIgnoreCase("Quit")) {
				for (int i = 0; i < months.length; i++) {
					if (months[i].equalsIgnoreCase(userInput)) {
						index = i;
						valid = true;
						break;
					}
				}
				if (valid) {
					System.out.println(months[index] + ": " + temps[index] + "°F");
				}
				else {
					System.out.println("Invalid month, Try again");
				}
			}
		}
		System.out.println("Goodbye");
		scnr.close();
	}

}
