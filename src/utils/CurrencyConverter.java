package utils;

public class CurrencyConverter {
	public static double realToDollar(double dollarPrice, double quantidy) {
		return quantidy * dollarPrice * 1.06;
	}
}
