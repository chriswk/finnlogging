package no.finntech.logtester;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOG = LogManager.getLogger();
    public static void main(String[] args) {
        LOG.info("Hello world");
    }
}
