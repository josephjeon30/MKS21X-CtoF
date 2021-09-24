/* 
The parameters of the functions should be temperatures in either Celsius or Fahrenheit and they should be in the type double.

The functions will return the temperatures in the opposite temperature unit.

*/

public class CtoFTester{
	public static void main(String[] args){
		System.out.println(celsiusToFahrenheit(0.0));
		System.out.println(celsiusToFahrenheit(100.0));
		System.out.println(fahrenheitToCelsius(32.0));
		System.out.println(fahrenheitToCelsius(60.0));
	}

	public static double celsiusToFahrenheit (double c) {
		return c * 9.0 / 5.0 + 32.0;
	}

	public static double fahrenheitToCelsius (double f) {
		return (f - 32.0) * 5.0 / 9.0;
	}
}