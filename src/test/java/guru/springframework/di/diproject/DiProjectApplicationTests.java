package guru.springframework.di.diproject;

import guru.springframework.di.diproject.controller.MyBasicController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiProjectApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyBasicController controller;
	@Test
	void testAppContextInitialization() {
		MyBasicController controller = applicationContext.getBean(MyBasicController.class);
		System.out.println(controller.sayHi());
	}

	@Test
	void testAutowireInitialization() {
		System.out.println(controller.sayHi());

	}

	@Test
	void contextLoads() {
	}

}
