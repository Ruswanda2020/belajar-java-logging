package progremmer_beginner.belajar_java_logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static final Logger log= LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog() {

        System.out.println("hallo logger");
        log.info("hallo loger");
        System.out.println("selamat belajar java logging");
        log.info("selamatbelajar java logging");
    }
}
