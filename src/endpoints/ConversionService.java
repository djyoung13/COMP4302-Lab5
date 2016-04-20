package endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "endpoints.ConversionServiceInterface")
public class ConversionService implements ConversionServiceInterface{

	@WebMethod
	public double inchesToFeet(int x) {
		return x / 12;
	}
	@WebMethod //Overloaded for double entry
	public double inchesToFeetD(double x) {
		return x / 12;
	}
	
	@WebMethod
	public double feetToInches(int x) {
		return x * 12;
	}
	@WebMethod
	public double feetToInchesD(double x) {
		return x * 12;
	}
	
	@WebMethod
	public double inchesToCenti(int x) {
		return (x * 2.54);
	}
	@WebMethod
	public double inchesToCentiD(double x) {
		return (x * 2.54);
	}
	
	@WebMethod
	public double centiToInches(int x) {
		return (x * 0.39370);
	}
	@WebMethod
	public double centiToInchesD(double x) {
		return (x * 0.39370);
	}

	@WebMethod
	public double feetToMiles(int x) {
		return (x * 0.00018939);
	}
	@WebMethod
	public double feetToMilesD(double x) {
		return (x * 0.00018939);
	}

	@WebMethod
	public double milesToFeet(int x){
		return (x * 5280);
	}
	@WebMethod
	public double milesToFeetD(double x){
		return (x * 5280);
	}
	
	@WebMethod
	public double milesToKilometers(int x){
		return (x * 0.6214);
	}
	@WebMethod
	public double milesToKilometersD(double x){
		return (x * 0.6214);
	}
	
	@WebMethod
	public double kilometersToMiles(int x){
		return (x / 0.6214);
	}
	@WebMethod
	public double kilometersToMilesD(double x){
		return (x / 0.6214);
	}

	@WebMethod
	public double daysToMonths(int x){
		return (x * 0.0328767);
	}
	@WebMethod
	public double daysToMonthsD(double x){
		return (x * 0.0328767);
	}

	@WebMethod
	public double monthsToDays(int x){
		return (x * 30.4167);
	}
	@WebMethod
	public double monthsToDaysD(double x){
		return (x * 30.4167);
	}

	@WebMethod
	public double weeksToYears(int x){
		return (x * 0.0191781);
	}
	@WebMethod
	public double weeksToYearsD(double x){
		return (x * 0.0191781);
	}

	@WebMethod
	public double yearsToWeeks(int x){
		return (x * 52.1429);
	}
	@WebMethod
	public double yearsToWeeksD(double x){
		return (x * 52.1429);
	}

}
