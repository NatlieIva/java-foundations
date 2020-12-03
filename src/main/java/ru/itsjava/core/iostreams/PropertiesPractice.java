package ru.itsjava.core.iostreams;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) throws IOException {

        InputStream resourceAsStream = PropertiesPractice.class.getClassLoader().getResourceAsStream("application.properties");
        Properties props = new Properties();
        props.load(resourceAsStream);
        System.out.println(props.getProperty("key1"));
        System.out.println(props.getProperty("key2"));

        System.out.println(Settings.getValue("key3"));
    }
}
