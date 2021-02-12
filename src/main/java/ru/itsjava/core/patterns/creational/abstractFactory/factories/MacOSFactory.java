package ru.itsjava.core.patterns.creational.abstractFactory.factories;

import ru.itsjava.core.patterns.creational.abstractFactory.buttons.Button;
import ru.itsjava.core.patterns.creational.abstractFactory.buttons.MacOSButton;
import ru.itsjava.core.patterns.creational.abstractFactory.checkboxes.Checkbox;
import ru.itsjava.core.patterns.creational.abstractFactory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
