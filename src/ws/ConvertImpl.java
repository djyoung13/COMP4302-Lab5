package ws;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.Convert")
public class ConvertImpl implements Convert {
	@Override
	public double inchesToFeet(int x) {
		return x / 12;
	}
	@Override
	public double inchesToFeetD(double x) {
		return x / 12;
	}
	
	@Override
	public double feetToInches(int x) {
		return x * 12;
	}
	@Override
	public double feetToInchesD(double x) {
		return x * 12;
	}
	
	@Override
	public double inchesToCenti(int x) {
		return (x * 2.54);
	}
	@Override
	public double inchesToCentiD(double x) {
		return (x * 2.54);
	}
	
	@Override
	public double centiToInches(int x) {
		return (x * 0.39370);
	}
	@Override
	public double centiToInchesD(double x) {
		return (x * 0.39370);
	}

	@Override
	public double feetToMiles(int x) {
		return (x * 0.00018939);
	}
	@Override
	public double feetToMilesD(double x) {
		return (x * 0.00018939);
	}

	@Override
	public double milesToFeet(int x){
		return (x * 5280);
	}
	@Override
	public double milesToFeetD(double x){
		return (x * 5280);
	}
	
	@Override
	public double milesToKilometers(int x){
		return (x * 0.6214);
	}
	@Override
	public double milesToKilometersD(double x){
		return (x * 0.6214);
	}
	
	@Override
	public double kilometersToMiles(int x){
		return (x / 0.6214);
	}
	@Override
	public double kilometersToMilesD(double x){
		return (x / 0.6214);
	}

	@Override
	public double daysToMonths(int x){
		return (x * 0.0328767);
	}
	@Override
	public double daysToMonthsD(double x){
		return (x * 0.0328767);
	}

	@Override
	public double monthsToDays(int x){
		return (x * 30.4167);
	}
	@Override
	public double monthsToDaysD(double x){
		return (x * 30.4167);
	}

	@Override
	public double weeksToYears(int x){
		return (x * 0.0191781);
	}
	@Override
	public double weeksToYearsD(double x){
		return (x * 0.0191781);
	}

	@Override
	public double yearsToWeeks(int x){
		return (x * 52.1429);
	}
	@Override
	public double yearsToWeeksD(double x){
		return (x * 52.1429);
	}

}	