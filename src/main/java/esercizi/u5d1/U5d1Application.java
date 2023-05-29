package esercizi.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class U5d1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(U5d1Application.class, args);
        Menu menu = context.getBean(Menu.class);
        menu.printMenu();
        context.close();

        System.out.println("Ciao Mondo");
    }
}
