package ru.itsjava.core.logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BestLogger {
    private StringBuilder logger = new StringBuilder();
    private Date curDate;

    public StringBuilder addInfo(String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY : HH-mm");
        curDate = new Date();
        logger.append(dateFormat.format(curDate) + " - " + message + "\n");
        return logger;
    }

    public String findByMessage(String message) {
        String s = "Found";
//        Pattern pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}\\s:\\s\\d{2}-\\d{2}\\s-\\s([a-zA-Z_0-9].+)");
        Pattern pattern = Pattern.compile(message);
        Matcher m = pattern.matcher(logger);
        while (m.find()) {
            s += " " + m.group(0);
        }
        return s;
    }

    public String findByDate(String date) {
        String s = "Found";
        Pattern pattern = Pattern.compile(date + "\\s:\\s\\d{2}-\\d{2}\\s-\\s([a-zA-Z_0-9].+)");
        Matcher m = pattern.matcher(logger);
        while (m.find()) {
            s += " " + m.group(0);
        }
        return s;
    }

    public void printLog(BestLogger logger) {
        System.out.println(logger.toString());
    }

    @Override
    public String toString() {
        return "BestLogger{" +
                "message='" + logger + '\'' +
                '}';
    }
}
