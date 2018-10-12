package com.vipul.examples.lambda;

import java.util.Arrays;
import java.util.List;

public class Phone {

	private String model;
	private String brand;
	private List<Network> networksSupported;
	private Battery battery;

	public Phone() {
		this.model = "dummy";
		this.brand = "dummy";
		this.networksSupported = Arrays.asList(Network.NET_2G);
		this.battery = new Battery();
	}

	public Phone(String model) {
		this.model = model;
	}

	public Phone(String model, String brand) {
		this(model);
		this.brand = brand;
	}

	public Phone(String model, String brand, List<Network> networksSupported) {
		this(model, brand);
		this.networksSupported = networksSupported;
	}

	public Phone(String model, String brand, List<Network> networksSupported, Battery battery) {
		this(model, brand);
		this.networksSupported = networksSupported;
		this.battery = battery;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Network> getNetworksSupported() {
		return networksSupported;
	}

	public void setNetworksSupported(List<Network> networksSupported) {
		this.networksSupported = networksSupported;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public static enum Network {
		NET_2G, NET_3G, NET_4G, NET_5G
	}

}
