package ru.itsjava.core.patterns.creational.abstractFactory;

import ru.itsjava.core.patterns.creational.abstractFactory.app.Application;
import ru.itsjava.core.patterns.creational.abstractFactory.factories.GUIFactory;
import ru.itsjava.core.patterns.creational.abstractFactory.factories.MacOSFactory;
import ru.itsjava.core.patterns.creational.abstractFactory.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}



