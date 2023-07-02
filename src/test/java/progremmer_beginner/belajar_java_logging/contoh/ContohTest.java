package progremmer_beginner.belajar_java_logging.contoh;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContohTest {
    private static final Logger log= LoggerFactory.getLogger(ContohTest.class);

    @Test
    void contohTest() {
        log.info("info");
        log.error("error");
    }
}
