package deep.com.SpRestDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"deep.com.controller","deep.com.service"})
@EnableAutoConfiguration
public class SpRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpRestDemoApplication.class, args);
	}
}
