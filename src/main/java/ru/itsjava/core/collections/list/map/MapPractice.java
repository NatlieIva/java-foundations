package ru.itsjava.core.collections.list.map;

import ru.itsjava.core.collections.list.set.Fruit;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<Man, Fruit> fruitHashMap = new HashMap<>();

        Fruit banana = new Fruit("Banana", 150.0);
        Fruit apple = new Fruit("Apple", 200.0);
        Fruit peach = new Fruit("Peach", 250.0);
        Fruit apricot = new Fruit("Apricot", 100.0);
        Fruit watermelon = new Fruit("Watermelon", 5000.0);
        Fruit melon = new Fruit("Melon", 2000.0);

        Man man1 = new Man("Bob");
        Man man2 = new Man("Sam");
        Man man3 = new Man("Ann");
        Man man4 = new Man("Will");
        Man man5 = new Man("Tom");
        Man man6 = new Man("Kate");
        Man man7 = new Man("Victor");
        Man man8 = new Man("Mary");
        Man man9 = new Man("Alisa");


        fruitHashMap.put(man1, banana);
        fruitHashMap.put(man2, melon);
        fruitHashMap.put(man3, apple);
        fruitHashMap.put(man4, peach);
        fruitHashMap.put(man4, apricot);
        fruitHashMap.put(man5, watermelon);
        fruitHashMap.put(man6, melon);
        fruitHashMap.put(man7, watermelon);
        fruitHashMap.put(man8, watermelon);
        fruitHashMap.put(man9, watermelon);

        System.out.println("fruitHashMap = " + fruitHashMap);

//        1. Получение элемента по ключу (Получить любой фрукт по покупателю)
        System.out.println("fruitHashMap.get(\"Sam\") = " + fruitHashMap.get("Sam"));
//
//        3. Удаление элемента а). Удалить любой фрукт
        fruitHashMap.remove("Sam");
//        System.out.println("fruitHashMap = " + fruitHashMap);


//        4. Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)
        System.out.println("fruitHashMap.containsKey(\"Will\") = " + fruitHashMap.containsKey("Will"));
        System.out.println("fruitHashMap.containsValue(watermelon) = " + fruitHashMap.containsValue(watermelon));

//        5. Вывод Map на экран:
//        a) Вывести все ключи (всех покупателей)
        System.out.println(fruitHashMap.keySet());

//        б) Вывести все значения (все фрукты)
        System.out.println(fruitHashMap.values());

//        в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            System.out.println(pair.getKey().getName() + " " + pair.getValue());
        }

//        6. Отфильтровать Map вернуть записи по некоторому условию:
//        а) Условие на ключ: вернуть количество ключей длина которых больше 3 (покупателей, чье имя больше 3)
        int count = 0;
        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            if (pair.getKey().getName().length() > 3) {
                count++;
            }
        }
        System.out.println("Keys length > 3: " + count);

//        б) Условие на значение: Вернуть количество элементов, которые равны "***" (фруктов, которые равны дыне)
        int count1 = 0;
        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            if (pair.getValue().getName().equals("melon")) {
                count1++;
            }
        }
        System.out.println("Mans have " + count + " melons");


//    7. Пропустить несколько элементов
//    а) Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.

//        System.out.println(fruitHashMap);
        int count2 = 0;
        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            if (pair.getValue().getName().equals("Watermelon")) {
                count2++;
            }
            if ((count2 > 2) && (pair.getValue().getName().equals("Watermelon"))) {
                System.out.println(pair.getKey().getName() + " " + pair.getValue());
            }
        }

//        б) Вывести все кроме 2 элементов, ключи которых начинаются на A

        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            if (!pair.getKey().getName().startsWith("A")) {
                System.out.println(pair.getKey().getName() + " " + pair.getValue());
            }
        }
//        8. Вернуть первый подходящий элемент:
//        а) Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.
        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            if (pair.getValue().getName().equalsIgnoreCase("watermelon")) {
                System.out.println(pair.getKey().getName() + " " + pair.getValue());
                break;
            }
        }

//        9. Возвращаем все элементы удовлетворяющие условию:
//        а) Возвращаем все элементы в другую карту, которые являются дынями
        HashMap<Man, Fruit> newFruitHashMap = new HashMap<>();
        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            if (pair.getValue().getName().equalsIgnoreCase("melon")) {
                newFruitHashMap.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println(newFruitHashMap);

//        10. Найти средний вес всех фруктов.
        int count4 = 0;
        double sumWeight = 0;
        for (Map.Entry<Man, Fruit> pair : fruitHashMap.entrySet()
        ) {
            count4++;
            sumWeight = sumWeight + pair.getValue().getWeight();
        }
        System.out.println("Average weight " + sumWeight / count4 + " kg");
    }
}
