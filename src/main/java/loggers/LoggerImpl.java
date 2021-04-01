package loggers;


import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerImpl {

    public static void main(String[] args) {


        Logger logger = Logger.getLogger("loggers.log");
        logger.setLevel(Level.ALL);

        logger.info("hello info");
        logger.warning("warning");
        logger.log(Level.WARNING,"new message with exeption");
    }


}
