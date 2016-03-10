package com.acadglid.java.core.session5.assignment2;

public class Buildings {
	private int numberOfDoors;
	private int numberOfWindows;
	private String wallmaterial;
	private double areaOfBuilding;
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfWindows() {
		return numberOfWindows;
	}
	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}
	public String getWallmaterial() {
		return wallmaterial;
	}
	public void setWallmaterial(String wallmaterial) {
		this.wallmaterial = wallmaterial;
	}
	public double getAreaOfBuilding() {
		return areaOfBuilding;
	}
	public void setAreaOfBuilding(double areaOfBuilding) {
		this.areaOfBuilding = areaOfBuilding;
	}
	public String toString(){
		return "number of doors are: "+this.getNumberOfDoors()+ ", number of windows are : "+this.getNumberOfWindows() + ", wall is made of  " + this.getWallmaterial() + ", area of bulding is: "+this.getAreaOfBuilding()+" square feet";
		
	}
	
	

}
