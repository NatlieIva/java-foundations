package ru.itsjava.core.patterns.creational.abstractFactory.checkboxes;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 * <p>
 * Вариация чекбокса под Windows.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
