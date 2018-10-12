package com.vipul.examples.lambda;

import java.util.Optional;

public class Camera {

	private String type;
	private float resolution;
	private Optional<String> flashType;

	public Camera() {
		this.type = "VGA";
		this.resolution = 0.3f;
		this.flashType = Optional.empty();
	}

	public Camera(String type, float resolution, String flashType) {
		this.type = type;
		this.resolution = resolution;
		this.flashType = flashType != null ? Optional.of(flashType) : Optional.<String>empty();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getResolution() {
		return resolution;
	}

	public void setResolution(float resolution) {
		this.resolution = resolution;
	}

	public Optional<String> getFlashType() {
		return flashType;
	}

	public void setFlashType(Optional<String> flashType) {
		this.flashType = flashType;
	}

}
