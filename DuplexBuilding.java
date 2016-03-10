package com.acadglid.java.core.session5.assignment2;

public class DuplexBuilding extends Buildings{
	private int numberOfFloors;
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	
	public String toString(){
		return "number of floors:"+this.getNumberOfFloors()+ ", "+super.toString();
	}

}
