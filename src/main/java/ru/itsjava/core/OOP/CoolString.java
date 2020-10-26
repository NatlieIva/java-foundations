package ru.itsjava.core.OOP;

import java.util.Arrays;

public class CoolString {
    public static void main(String[] args) {

        String str = " Я классная строка, поиграйся со мной!";
        String str2 = "классная строка";

        // преобразование строки к верхнему регистру
        System.out.println(str.toUpperCase());

        //преобразование строки к нижнему регистру
        System.out.println(str.toLowerCase());

        //возвращение подстроки от индекса до конца
        System.out.println(str.substring(11));

        //возвращение подстроки между индексами
        System.out.println(str.substring(11, 28));

        //убирает пробелы до и после
        System.out.println(str.trim());

        //поиск совпадения после определенного индекса в строке 1 части строки 2
        System.out.println(str.regionMatches(3, str2, 0, 7));

        //замена набора символов другим набором
        System.out.println(str.replace("классная", "стремная"));


        // замена всех выражений другим
        System.out.println(str.replaceAll("о", "РРР"));

        //замена первого вхождения другим
        System.out.println(str.replaceFirst("о", "РРР"));

        String[] strAfterSplit = str.split("о");
        System.out.println(Arrays.toString(strAfterSplit));

    }
}
