package ru.itsjava.core.patterns.creational.factoryMethod.factory;

import ru.itsjava.core.patterns.creational.factoryMethod.buttons.Button;
import ru.itsjava.core.patterns.creational.factoryMethod.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
