package client;

import client.Convert;
import client.ConvertImplService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertClient {

	public static void main(String[] args) throws IOException{
		ConvertImplService convertService = new ConvertImplService();
		Convert convert = convertService.getConvertImplPort();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Use this format: [amount] [unit1] ? [unit2]");
		System.out.println("Then I'll convert it from unit1 to unit2!");
		System.out.println("Enter the units you would like to convert: ");
		
		String input = br.readLine();
		
		try{
			String[] resultArray = input.split("\\s+");
			int amount = Integer.parseInt(resultArray[0]);
			double amount_d = Double.parseDouble(resultArray[0]);
			String unit1 = resultArray[1];
			String unit2 = resultArray[3];
			
			if(unit1.equalsIgnoreCase("in")){
				if(unit2.equalsIgnoreCase("ft")){
					int response = (int) Convert.inchesToFeet(amount);
					System.out.println(amount + "inches equals " + response + "feet!");
					double response_d = Convert.inchesToFeetD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "inches equals " + response_d + "feet!");
				}
				else if(unit2.equalsIgnoreCase("cm")){
					int response = (int) Convert.inchesToCenti(amount);
					System.out.println(amount + "inches equals " + response + "centimeters!");
					double response_d = Convert.inchesToCentiD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "inches equals " + response_d + "centimeters!");
				}
			}
			
			if(unit1.equalsIgnoreCase("ft")){
				if(unit2.equalsIgnoreCase("in")){
					int response = (int) Convert.feetToInches(amount);
					System.out.println(amount + "feet equals " + response + "inches!");
					double response_d = Convert.feetToInchesD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "feet equals " + response_d + "inches!");
				}
				else if(unit2.equalsIgnoreCase("mi")){
					int response = (int) Convert.feetToMiles(amount);
					System.out.println(amount + "feet equals " + response + "miles!");
					double response_d = Convert.feetToMilesD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "feet equals " + response_d + "miles!");
				}
			}
			
			if(unit1.equalsIgnoreCase("cm")){
				if(unit2.equalsIgnoreCase("in")){
					int response = (int) Convert.centiToInches(amount);
					System.out.println(amount + "centimeters equals " + response + "inches!");
					double response_d = Convert.centiToInchesD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "centimeters equals " + response_d + "inches!");
				}
			}
			
			if(unit1.equalsIgnoreCase("mi")){
				if(unit2.equalsIgnoreCase("ft")){
					int response = (int) Convert.milesToFeet(amount);
					System.out.println(amount + "miles equals " + response + "feet!");
					double response_d = Convert.milesToFeetD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "miles equals " + response_d + "feet!");
				}
				else if(unit2.equalsIgnoreCase("km")){
					int response = (int) Convert.milesToKilometers(amount);
					System.out.println(amount + "miles equals " + response + "kilometers!");
					double response_d = Convert.milesToKilometersD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "miles equals " + response_d + "kilometers!");
				}
			}
			
			if(unit1.equalsIgnoreCase("km")){
				if(unit2.equalsIgnoreCase("mi")){
					int response = (int) Convert.kilometersToMiles(amount);
					System.out.println(amount + "kilometers equals " + response + "miles!");
					double response_d = Convert.kilometersToMilesD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "kilometers equals " + response_d + "miles!");
				}
			}
			
			if(unit1.equalsIgnoreCase("days")){
				if(unit2.equalsIgnoreCase("months")){
					int response = (int) Convert.daysToMonths(amount);
					System.out.println(amount + "days equals " + response + "months!");
					double response_d = Convert.daysToMonthsD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "days equals " + response_d + "months!");
				}
			}
			
			if(unit1.equalsIgnoreCase("months")){
				if(unit2.equalsIgnoreCase("days")){
					int response = (int) Convert.monthsToDays(amount);
					System.out.println(amount + "months equals " + response + "days!");
					double response_d = Convert.monthsToDaysD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "months equals " + response_d + "days!");
				}
			}
			
			if(unit1.equalsIgnoreCase("weeks")){
				if(unit2.equalsIgnoreCase("years")){
					int response = (int) Convert.weeksToYears(amount);
					System.out.println(amount + "weeks equals " + response + "years!");
					double response_d = Convert.weeksToYearsD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "weeks equals " + response_d + "years!");
				}
			}
			
			if(unit1.equalsIgnoreCase("years")){
				if(unit2.equalsIgnoreCase("weeks")){
					int response = (int) Convert.yearsToWeeks(amount);
					System.out.println(amount + "years equals " + response + "weeks!");
					double response_d = Convert.yearsToWeeksD(amount_d);
					System.out.println("Double vers.: "+ amount_d + "years equals " + response_d + "weeks!");
				}
			}
		}
		catch(Exception e){
			System.out.println("Invalid input! Please use the given format");
		}
	}
}
