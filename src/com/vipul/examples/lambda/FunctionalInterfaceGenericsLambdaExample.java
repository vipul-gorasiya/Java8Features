package com.vipul.examples.lambda;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceGenericsLambdaExample {

	// Functional interface example with Generics
	@FunctionalInterface
	public static interface Search<T> {
		public boolean test(T p);
	}

	public static void main(String[] args) {
		LambdaExamples examples = new LambdaExamples();

		// providing lambda as functional interface implementation with
		// different conditions

		// printMatchingPhones is typed with phone in following three examples
		// Print basic Phones
		System.out.println("Basic Phones: ");
		printMatchingPhones(examples, p -> !(p instanceof SmartPhone));
		System.out.println();

		// Print smart Phones
		System.out.println("Smart Phones: ");
		printMatchingPhones(examples, p -> p instanceof SmartPhone);
		System.out.println();

		// print phone with front cameras
		System.out.println("Phones with front camera: ");
		printMatchingPhones(examples, p -> p instanceof SmartPhone && ((SmartPhone) p).getFrontCamera().isPresent());
		System.out.println();

		// following examples takes lambda expression as implementation of
		// search with String
		List<String> inputs = Arrays.asList("1", "not number", "5", "8", "", "Anything");
		System.out.println("Print numbers from inputs:");
		printStrings(inputs, s -> {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				return false;
			}
			return true;
		});

		System.out.println("Print non-numbers from inputs:");
		printStrings(inputs, s -> {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				return true;
			}
			return false;
		});

	}

	/**
	 * Prints phones which are satisfying criteria provided in searchPhone
	 * 
	 * @param examples
	 * @param searchPhone
	 */
	private static void printMatchingPhones(LambdaExamples examples, Search<Phone> searchPhone) {
		examples.getPhones().forEach(p -> {
			if (searchPhone.test(p))
				System.out.println(p.getBrand() + " " + p.getModel());
		});
	}

	/**
	 * Prints phones which are satisfying criteria provided in searchPhone
	 * 
	 * @param examples
	 * @param searchPhone
	 */
	private static void printStrings(List<String> list, Search<String> searchPhone) {
		list.forEach(p -> {
			if (searchPhone.test(p))
				System.out.println(p);
		});
	}

}
