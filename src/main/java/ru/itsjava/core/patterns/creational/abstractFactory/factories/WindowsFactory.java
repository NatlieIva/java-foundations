package ru.itsjava.core.patterns.creational.abstractFactory.factories;

import ru.itsjava.core.patterns.creational.abstractFactory.buttons.Button;
import ru.itsjava.core.patterns.creational.abstractFactory.buttons.WindowsButton;
import ru.itsjava.core.patterns.creational.abstractFactory.checkboxes.Checkbox;
import ru.itsjava.core.patterns.creational.abstractFactory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}