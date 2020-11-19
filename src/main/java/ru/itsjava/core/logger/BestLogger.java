package ru.itsjava.core.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BestLogger {
    private StringBuilder logger = new StringBuilder();

    public StringBuilder addInfo(String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY : HH-mm");
        logger.append(dateFormat.format(new Date()) + " - " + message + "\n");
        return logger;
    }

// поиск по слову
//    public String findInfo(String messageForFind) {
//        StringBuilder foundMessage = new StringBuilder();
//        String[] words = info.toString().split(" ");
//        int indStartMessage = -1;
//
//        int indexMessageForFind = -1;
//        for (int i = 0; i < words.length; i++) {
//            indexMessageForFind = i;
//            if (words[i].equalsIgnoreCase(messageForFind)) {
//                break;
//            }
//        }
//        for (int j = indexMessageForFind; j > 0; j--) {
//            indStartMessage = j + 1;
//            if (words[j].equals("-")) {
//                break;
//            }
//        }
//        for (int k = indStartMessage; k < words.length -1; k++) {
//            foundMessage.append(words[k] + " ");
//            if (words[k].equals("\n")) {
//                break;
//            }
//        } return foundMessage.toString();
//    }

    public String findByMessage(String message) {
        String[] strings = logger.toString().split("\n");
        for (String str : strings
        ) {
            if (str.contains(message)) {
                return str;
            }
        }
        return null;
    }

    public String findByDate(String date) {
        String[] strings = logger.toString().split("\n");
        for (String str : strings
        ) {
            if (str.contains(date)) {
                return str;
            }
        }
        return null;
    }

    public void printLog(BestLogger logger) {
        System.out.println(logger.toString());
    }

//    public String findByDate(String date){
//        StringBuilder foundMessage = new StringBuilder();
//        String[] strings = info.toString().split("\n");
//        int count = 0;
//
//        for (String str:strings
//             ) {
//            count++;
//            if (str.matches("^\\d{2}-\\d{2}-\\d{4}\\s:\\s\\d{2}-\\d{2}\\s-")){
//                break;
//            }
//        }
//        for (int i = count; i < strings.length -1; i++) {
//            foundMessage.append(strings[i] + " ");
//            if (strings[i].equals("\n")) {
//                break;
//            }
//        }
//        return foundMessage.toString();
//    }


    @Override
    public String toString() {
        return "BestLogger{" +
                "message='" + logger + '\'' +
                '}';
    }
}
