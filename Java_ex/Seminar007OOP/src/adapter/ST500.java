package adapter;

import java.util.Random;

public class ST500 implements SensorTemperature{
       Random rnd = new Random();

    private int id;

    {
        id = rnd.nextInt(10001,99999);
    }

    @Override
    public int getIdentifier() {
        return id;
    }

    @Override
    public double getTemp() {
        return 30.1;
    }
    

    
}
