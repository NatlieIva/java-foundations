package ru.itsjava.core.logger;

public class LoggerPractice {
    public static void main(String[] args) {
        BestLogger logger = new BestLogger();
        logger.addInfo("Message 1");
        logger.addInfo("Message 2");
        logger.addInfo("Message 3");
        logger.addInfo("Message 4");
        logger.addInfo("Message 5");
        logger.addInfo("Message wrong");

        logger.printLog(logger);

        System.out.println(logger.findByMessage("Message 3"));
        System.out.println(logger.findByDate("25-11-2020"));
    }
}
