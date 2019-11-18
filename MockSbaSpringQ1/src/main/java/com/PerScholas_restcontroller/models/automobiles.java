package com.PerScholas_restcontroller.models;

import java.util.Date;

public class automobiles {
	 private int vehicleID;
	 private String make;
	 private String model;
	 private String colors;
	 public automobiles() {};
		
		public automobiles(int vehicleID, String make, String model, String colors) {
			this.vehicleID = vehicleID;
			this.make = make;
			this.model = model;
			this.colors = colors;
		}

		public int getVehicleID() {
			return vehicleID;
		}

		public void setVehicleID(int vehicleID) {
			this.vehicleID = vehicleID;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getColors() {
			return colors;
		}

		public void setColors(String colors) {
			this.colors = colors;
		}
		
}
