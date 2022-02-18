package com.dependencyinjection.dependencyinjection;

import com.dependencyinjection.dependencyinjection.controllers.ConstructorDIController;
import com.dependencyinjection.dependencyinjection.controllers.FieldDIController;
import com.dependencyinjection.dependencyinjection.controllers.SetterDIController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		System.out.println("property injector example");

		FieldDIController fieldDIController = (FieldDIController) context.getBean("fieldDIController");
		ConstructorDIController constructorDIController = (ConstructorDIController) context.getBean("constructorDIController");
		SetterDIController setterDIController = (SetterDIController) context.getBean("setterDIController");

		System.out.println(fieldDIController.getDrivingSpeed());
		System.out.println(fieldDIController.getVehcile());

		System.out.println("The constructor controller is printing:  ");
		System.out.println(constructorDIController.vehicleBeingDriven());

		System.out.println("The setter controller is printing: ");
		System.out.println(setterDIController.getVehicle());







	}

}
