package nearsoft.iot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ahernandez on 7/15/16.
 */
@SpringBootApplication
@ComponentScan({"nearsoft.iot"})
public class Application {

    Long a;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Application ap = new Application();
        System.out.println(ap.a);
    }
}
