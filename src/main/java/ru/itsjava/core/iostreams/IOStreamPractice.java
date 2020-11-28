package ru.itsjava.core.iostreams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IOStreamPractice {

    public static void main(String[] args) {
        File file1 = new File("src/main/resources/File1.txt");
        File file2 = new File("src/main/resources/File2.txt");

        try (PrintWriter printWriter1 = new PrintWriter(file1)) {
            printWriter1.println("11111");
            printWriter1.println("1111");
            printWriter1.println("111");
            printWriter1.println("11");
            printWriter1.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (PrintWriter printWriter2 = new PrintWriter(file2)) {
            printWriter2.println("22222");
            printWriter2.println("2222");
            printWriter2.println("222");
            printWriter2.println("22");
            printWriter2.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        Path path = Paths.get("src/main/resources/File2.txt");
//        try (BufferedReader reader = Files.newBufferedReader(path)) {

        System.out.println("Before changes: ");

        System.out.println("File 1: ");
        List<String> lines1 = getStrings("src/main/resources/File1.txt");
        printString(lines1);
        System.out.println("File 2: ");
        List<String> lines2 = getStrings("src/main/resources/File2.txt");
        printString(lines2);

        writeByList(file1, lines2);
        writeByList(file2, lines1);

        System.out.println("After changes: ");

        System.out.println("File 1: ");
        lines1 = getStrings("src/main/resources/File1.txt");
        printString(lines1);
        System.out.println("File 2: ");
        lines2 = getStrings("src/main/resources/File2.txt");
        printString(lines2);


    }

    public static void writeByList(File file, List<String> lines) {
        try (PrintWriter printWriter1 = new PrintWriter(file)) {
            for (String line : lines
            ) {
                printWriter1.println(line);
            }
            printWriter1.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getStrings(String path) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
//            printString(lines);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return lines;
    }

    public static void printString(List<String> lines) {
        for (String line : lines
        ) {
            System.out.println(line);
        }
    }

}
