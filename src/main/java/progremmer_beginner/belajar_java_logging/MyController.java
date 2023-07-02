package progremmer_beginner.belajar_java_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyController {
    private static final Logger log= LoggerFactory.getLogger(MyController.class);
    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void save(){
        log.info("controller save");
        this.myService.save();

    }
}
