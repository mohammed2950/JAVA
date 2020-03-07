package com.isi.airplane.model;

public enum Airplanestate {

	OFF,RUNNING,FLYING;

	@Override
	public String toString() {
		switch(this) {
		case  OFF:
			return "OFF";
		case RUNNING:
			return "running";
		case FLYING:
			return "Flying";
		}
		return null;
	}
}
