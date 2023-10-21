package hf.dp.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float avgTemperature;
    private float maxTemperature;
    private float minTemperature;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        avgTemperature = 0.0f;
        maxTemperature = Float.MIN_VALUE;
        minTemperature = Float.MAX_VALUE;
        numReadings = 0;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        avgTemperature = (avgTemperature*numReadings++ + temp) / numReadings;
        if (temp > maxTemperature) {
            maxTemperature = temp;
        }
        if (temp < minTemperature) {
            minTemperature = temp;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }
}
