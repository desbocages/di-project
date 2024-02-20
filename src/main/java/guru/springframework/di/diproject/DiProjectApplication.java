package guru.springframework.di.diproject;

import guru.springframework.di.diproject.controller.MyBasicController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(DiProjectApplication.class, args);
		MyBasicController myBasicController = appContext.getBean(MyBasicController.class);
		System.out.println(myBasicController.sayHi());

	}

}
