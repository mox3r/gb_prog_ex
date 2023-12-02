package adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {
    int getId();
    double getTemperature();
    double getHumidity();
    double getPressure();
    LocalDateTime getDateTime();
}
