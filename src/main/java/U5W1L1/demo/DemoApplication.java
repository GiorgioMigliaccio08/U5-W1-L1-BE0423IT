package U5W1L1.demo;

import U5W1L1.demo.entities.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public class Main {

		public static void main(String[] args) {

			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


			Menu menu = context.getBean(Menu.class);


			System.out.println(menu);
		}
	}
}
