package desafio_003.temperatureconverter;

public class TemperatureMain {
	public static void main(String[] args) {
		ConverterTemperatureStandard converter = new ConverterTemperatureStandard();

		converter.setFahrenheitTemperature(88);
		converter.setCelsiusTemperature(31);

		converter.celsiusToFahrenheit();
		converter.fahrenheitToCelsius();
	}
}
