package com.vipul.examples.lambda;

public class FunctionalInterfaceLambdaExample {

	// Functional interface example
	@FunctionalInterface
	public static interface SearchSmartPhone {
		public boolean testPhone(Phone p);
	}

	public static void main(String[] args) {
		LambdaExamples examples = new LambdaExamples();

		// providing lambda as functional interface implementation with
		// different conditions
		// Print smart Phones
		System.out.println("Smart Phones: ");
		printMatchingForms(examples, p -> p instanceof SmartPhone);

		// print phone with front cameras
		System.out.println("Phones with front camera: ");
		printMatchingForms(examples, p -> p instanceof SmartPhone && ((SmartPhone) p).getFrontCamera().isPresent());
	}

	private static void printMatchingForms(LambdaExamples examples, SearchSmartPhone searchPhone) {
		examples.getPhones().forEach(p -> {
			if (searchPhone.testPhone(p))
				System.out.println(p.getBrand() + " " + p.getModel());
		});
	}

}
