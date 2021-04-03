package loggers;

import java.io.IOException;
import java.net.URL;


public class Main {
    private static final System.Logger LOGGER = System.getLogger("Main");
    public static void main(final String[] args) {
        LOGGER.log(System.Logger.Level.INFO, "Run!");
        try {
            new URL("https://google.com").openConnection().connect();
        } catch (final IOException e) {
            LOGGER.log(System.Logger.Level.WARNING, "Failed to connect", e);
        }
    }
}