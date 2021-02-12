package ru.itsjava.core.patterns.creational.builder.builders;

import ru.itsjava.core.patterns.creational.builder.cars.CarType;
import ru.itsjava.core.patterns.creational.builder.components.Engine;
import ru.itsjava.core.patterns.creational.builder.components.GPSNavigator;
import ru.itsjava.core.patterns.creational.builder.components.Transmission;
import ru.itsjava.core.patterns.creational.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}

