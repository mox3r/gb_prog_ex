package adapter;

import java.time.LocalDateTime;
import java.util.Random;

public class MS200 implements MeteoSensor{
    Random rnd = new Random();

    private int id;

    {
        id = rnd.nextInt(10001,99999);
    }

    @Override
    public int getId() {
       return id;
    }

    @Override
    public double getTemperature() {
        return 23;
    }

    @Override
    public double getHumidity() {
        return 50;
    }

    @Override
    public double getPressure() {
        return 754.5;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
    
}
