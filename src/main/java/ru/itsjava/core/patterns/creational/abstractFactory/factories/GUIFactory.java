package ru.itsjava.core.patterns.creational.abstractFactory.factories;

import ru.itsjava.core.patterns.creational.abstractFactory.buttons.Button;
import ru.itsjava.core.patterns.creational.abstractFactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}