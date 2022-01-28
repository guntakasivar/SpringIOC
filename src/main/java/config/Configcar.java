package config;

import org.springframework.context.annotation.Bean;

import classfile.Car;


public class Configcar {
	@Bean
	public Car c() {
		Car car = new Car();
		car.setCc(5555);
		car.setName("Tesla");
		car.setType("Electric");
		return car;
	}
}
