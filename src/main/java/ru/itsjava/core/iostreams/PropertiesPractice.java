package ru.itsjava.core.iostreams;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) {

        InputStream resourceAsStream = PropertiesPractice.class.getClassLoader().getResourceAsStream("application.properties");
        Properties props = new Properties();
        try {
            props.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(props.getProperty("key1"));
//        System.out.println(props.getProperty("key2"));

        try {
            System.out.println(Settings.getValue("key3"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
