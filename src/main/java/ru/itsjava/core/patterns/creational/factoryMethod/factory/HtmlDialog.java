package ru.itsjava.core.patterns.creational.factoryMethod.factory;

import ru.itsjava.core.patterns.creational.factoryMethod.buttons.Button;
import ru.itsjava.core.patterns.creational.factoryMethod.buttons.HtmlButton;

/**
 * HTML-диалог.
 */

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
