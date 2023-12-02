package adapter;

public class MeteoStore {
    boolean save(MeteoSensor meteoSensor) {
        System.out.format("Saving data from sensor [%d], at %s%n temp - %.2f, humidity - %.2f, pressure - %.2f\n",
                meteoSensor.getId(),
                meteoSensor.getDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }
}
