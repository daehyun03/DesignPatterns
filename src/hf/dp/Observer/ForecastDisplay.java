package hf.dp.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float curPressure = 0.0f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
         lastPressure = curPressure;
         curPressure = pressure;
         display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (curPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (curPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (curPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
