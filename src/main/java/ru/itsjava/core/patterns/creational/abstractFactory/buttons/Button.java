package ru.itsjava.core.patterns.creational.abstractFactory.buttons;

/**
 * Паттерн предполагает, что у вас есть несколько семейств продуктов,
 * находящихся в отдельных иерархиях классов (Button/Checkbox). Продукты одного
 * семейства должны иметь общий интерфейс.
 * <p>
 * Это — общий интерфейс для семейства продуктов кнопок.
 */
public interface Button {
    void paint();
}
