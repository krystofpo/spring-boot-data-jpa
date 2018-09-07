package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        ApplicationContext c = SpringApplication.run(Config.class, args);
        Program p = c.getBean(Program.class);
        String s = p.zacni();
        System.out.println("jmeno je :" + s);
    }
}
