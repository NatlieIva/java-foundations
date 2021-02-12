package ru.itsjava.core.patterns.creational.abstractFactory.buttons;

/**
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 * <p>
 * Это вариант кнопки под Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
