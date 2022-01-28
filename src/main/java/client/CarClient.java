package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import classfile.Car;
import config.Configcar;

public class CarClient {
	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(Configcar.class);
		Car car = ctxt.getBean("c",Car.class);
		System.out.println(car);
	}
}
