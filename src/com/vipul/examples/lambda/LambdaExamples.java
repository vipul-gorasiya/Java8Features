package com.vipul.examples.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vipul.examples.lambda.Battery.BatteryType;
import com.vipul.examples.lambda.Phone.Network;

public class LambdaExamples {

	private List<Phone> phones = null;

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public LambdaExamples() {
		init();
	}

	/**
	 * Initialize data for testing
	 */
	private void init() {
		phones = new ArrayList<Phone>();
		phones.add(new SmartPhone("Q73GB64GB", "LG", Arrays.asList(Network.NET_2G, Network.NET_3G, Network.NET_4G),
				new Battery(BatteryType.LI_POLYMER, "3000mAH"), "Android", "3GB", "64GB", "128GB",
				new Camera("HDR", 4f, null), new Camera("HDR", 12f, "dual")));
		phones.add(new Phone("130", "Nokia", Arrays.asList(Network.NET_2G, Network.NET_3G, Network.NET_4G),
				new Battery()));
		phones.add(new SmartPhone("NOVA 3I", "Huawei", Arrays.asList(Network.NET_2G, Network.NET_3G, Network.NET_4G),
				new Battery(BatteryType.LI_POLYMER, "4200mAH"), "Android", "2GB", "16GB", "32GB",
				new Camera("HDR", 2f, null), new Camera("HDR", 4f, "dual")));
		phones.add(new SmartPhone("MOTO G5s", "Motorola", Arrays.asList(Network.NET_2G, Network.NET_3G, Network.NET_4G),
				new Battery(BatteryType.LI_POLYMER, "5000mAH"), "Android", "6GB", "64GB", "256GB", null,
				new Camera("HDR", 15f, "dual")));
	}

}
