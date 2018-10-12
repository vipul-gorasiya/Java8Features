package com.vipul.examples.lambda;

public class Battery {

	private BatteryType type;
	private String capacity;

	public Battery() {
		type = BatteryType.LEAD;
		capacity = "800mAH";
	}

	public Battery(BatteryType type, String capacity) {
		this.type = type;
		this.capacity = capacity;
	}

	public static enum BatteryType {
		LI_ION, LEAD, LI_POLYMER
	}

	public BatteryType getType() {
		return type;
	}

	public void setType(BatteryType type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
