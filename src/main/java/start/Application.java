package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import extern.*;
import start.controllers.*;

@SpringBootApplication
@ComponentScan(basePackageClasses = CityDetailsRestController.class)
@ComponentScan(basePackageClasses = WeatherRestController.class)
@ComponentScan(basePackageClasses = ApiConfiguration.class)
public class Application {

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
}