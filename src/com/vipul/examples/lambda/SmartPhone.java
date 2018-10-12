package com.vipul.examples.lambda;

import java.util.List;
import java.util.Optional;

public class SmartPhone extends Phone {

	private String operatingSystem;
	private String ram;
	private String interalStorage;
	private Optional<String> expandableStorage;
	private Optional<Camera> frontCamera;
	private Optional<Camera> backCamera;

	public SmartPhone() {
		super();
		this.operatingSystem = "dummy";
		this.ram = "dummy";
		this.interalStorage = "dummy";
		this.expandableStorage = Optional.empty();
		this.frontCamera = Optional.empty();
		this.backCamera = Optional.empty();
	}

	public SmartPhone(String model, String brand, List<Network> networksSupported, Battery battery,
			String operatingSystem, String ram, String internalStorage, String expandableStorage, Camera frontCamera,
			Camera backCamera) {
		super(model, brand, networksSupported);
		this.operatingSystem = operatingSystem;
		this.ram = ram;
		this.interalStorage = internalStorage;
		this.expandableStorage = expandableStorage != null ? Optional.of(expandableStorage) : Optional.<String>empty();
		this.frontCamera = frontCamera != null ? Optional.of(frontCamera) : Optional.<Camera>empty();
		this.backCamera = backCamera != null ? Optional.of(backCamera) : Optional.<Camera>empty();
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getInteralStorage() {
		return interalStorage;
	}

	public void setInteralStorage(String interalStorage) {
		this.interalStorage = interalStorage;
	}

	public Optional<String> getExpandableStorage() {
		return expandableStorage;
	}

	public void setExpandableStorage(Optional<String> expandableStorage) {
		this.expandableStorage = expandableStorage;
	}

	public Optional<Camera> getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(Optional<Camera> frontCamera) {
		this.frontCamera = frontCamera;
	}

	public Optional<Camera> getBackCamera() {
		return backCamera;
	}

	public void setBackCamera(Optional<Camera> backCamera) {
		this.backCamera = backCamera;
	}

}
