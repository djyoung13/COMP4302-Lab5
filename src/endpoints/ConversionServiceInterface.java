package endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ConversionServiceInterface {
	
	@WebMethod
	public double inchesToFeet(int x);
	@WebMethod //Overloaded for double entry
	public double inchesToFeetD(double x);
	
	@WebMethod
	public double feetToInches(int x);
	@WebMethod
	public double feetToInchesD(double x);
	
	@WebMethod
	public double inchesToCenti(int x);
	@WebMethod
	public double inchesToCentiD(double x);
	
	@WebMethod
	public double centiToInches(int x);
	@WebMethod
	public double centiToInchesD(double x);

	@WebMethod
	public double feetToMiles(int x);
	@WebMethod
	public double feetToMilesD(double x);

	@WebMethod
	public double milesToFeet(int x);
	@WebMethod
	public double milesToFeetD(double x);
	
	@WebMethod
	public double milesToKilometers(int x);
	@WebMethod
	public double milesToKilometersD(double x);
	
	@WebMethod
	public double kilometersToMiles(int x);
	@WebMethod
	public double kilometersToMilesD(double x);

	@WebMethod
	public double daysToMonths(int x);
	@WebMethod
	public double daysToMonthsD(double x);

	@WebMethod
	public double monthsToDays(int x);
	@WebMethod
	public double monthsToDaysD(double x);

	@WebMethod
	public double weeksToYears(int x);
	@WebMethod
	public double weeksToYearsD(double x);

	@WebMethod
	public double yearsToWeeks(int x);
	@WebMethod
	public double yearsToWeeksD(double x);
}
