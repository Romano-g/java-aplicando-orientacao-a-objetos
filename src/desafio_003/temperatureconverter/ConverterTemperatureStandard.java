package desafio_003.temperatureconverter;

public class ConverterTemperatureStandard implements TemperatureConverter {
	private double celsiusTemperature;
	private double fahrenheitTemperature;

	public void setCelsiusTemperature(double celsiusTemperature) {
		this.celsiusTemperature = celsiusTemperature;
	}

	public void setFahrenheitTemperature(double fahrenheitTemperature) {
		this.fahrenheitTemperature = fahrenheitTemperature;
	}

	@Override
	public void celsiusToFahrenheit() {
		System.out.println((celsiusTemperature * 1.8) + 32);
	}

	@Override
	public void fahrenheitToCelsius() {
		System.out.println((fahrenheitTemperature - 32) / 1.8);
	}
}
