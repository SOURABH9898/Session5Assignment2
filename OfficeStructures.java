package com.acadglid.java.core.session5.assignment2;

public class OfficeStructures extends Buildings{
private int numberOfCafeteriaSpace;
private int numberOfRestrooms;
private int numberOfFloors;
private int numberOfElevator;

public int getNumberOfRestrooms() {
	return numberOfRestrooms;
}

public void setNumberOfRestrooms(int numberOfRestrooms) {
	this.numberOfRestrooms = numberOfRestrooms;
}

public int getNumberOfFloors() {
	return numberOfFloors;
}

public void setNumberOfFloors(int numberOfFloors) {
	this.numberOfFloors = numberOfFloors;
}

public int getNumberOfElevator() {
	return numberOfElevator;
}

public void setNumberOfElevator(int numberOfElevator) {
	this.numberOfElevator = numberOfElevator;
}

public int getNumberOfCafeteriaSpace() {
	return numberOfCafeteriaSpace;
}

public void setNumberOfCafeteriaSpace(int numberOfCafeteriaSpace) {
	this.numberOfCafeteriaSpace = numberOfCafeteriaSpace;
}
public String toString(){
	return "number of cafetria spaces are : " +this.getNumberOfCafeteriaSpace()+", Number of rest rooms: "+this.getNumberOfRestrooms()+", number of floors: "+this.getNumberOfFloors()+", Number of Elevators: "+this.getNumberOfElevator()+", "+super.toString(); 
}

}
