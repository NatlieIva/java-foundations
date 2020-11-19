package ru.itsjava.core.logger;

public class LoggerPractice {
    public static void main(String[] args) {
        BestLogger logger = new BestLogger();
        logger.addInfo("Сообщение 1");
        logger.addInfo("Сообщение 2");
        logger.addInfo("Сообщение 3");
        logger.addInfo("Сообщение 4");
        logger.addInfo("Сообщение 5");
        logger.addInfo("Сообщение об ошибке");

        logger.printLog(logger);

        System.out.println(logger.findByMessage("Сообщение 3"));
    }
}
