package pl.dom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
//		ApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);
		ConfigurableApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);
		Customers c = (Customers) ctx.getBean(Customers.class);
		c.display();
		System.out.println("name : " + c.getName());
		ctx.close();
	}

}
