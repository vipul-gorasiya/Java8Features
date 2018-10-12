package com.vipul.examples.lambda;

import java.util.function.Consumer;
import java.util.stream.Collectors;

public class PredicateLambdaExample {

	public static void main(String[] args) {
		LambdaExamples examples = new LambdaExamples();

		// providing lambda as predicate and consumer

		// Store lambda as consumer and use it for printing phones
		Consumer<Phone> printPhoneConsumer = (Phone p) -> System.out.println(p.getBrand() + " " + p.getModel());

		// Print basic Phones
		System.out.println("Basic Phones: ");
		// filter method of Stream takes in Predicate as parameter where you can
		// supply lambda with boolean expression
		examples.getPhones().stream().filter(p -> !(p instanceof SmartPhone)).collect(Collectors.toList())
				.forEach(printPhoneConsumer);
		System.out.println();

		// Print smart Phones
		System.out.println("Smart Phones: ");
		examples.getPhones().stream().filter(p -> p instanceof SmartPhone).collect(Collectors.toList())
				.forEach(printPhoneConsumer);
		System.out.println();

		// print phone with front cameras
		System.out.println("Phones with front camera: ");
		examples.getPhones().stream()
				.filter(p -> p instanceof SmartPhone && ((SmartPhone) p).getFrontCamera().isPresent())
				.collect(Collectors.toList()).forEach(printPhoneConsumer);
	}

}
