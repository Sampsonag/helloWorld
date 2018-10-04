package mooc;

import java.util.Random;

public class WeatherForecaster22 {
    private Random random;

    public WeatherForecaster22() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();
        
 

        if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "Snow";
        } else { // the rest, 1.0 - 0.4 = 0.6
            return "Sunny";
        }
    }

    public int forecastTemperature() {
        return (int) ( 4 * this.random.nextGaussian() - 3 );
    }
}