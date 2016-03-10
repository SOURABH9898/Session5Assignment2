package com.acadglid.java.core.session5.assignment2;

public class TestBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplexBuilding dbr=new DuplexBuilding();
		dbr.setNumberOfFloors(2);
		dbr.setNumberOfDoors(4);
		dbr.setNumberOfWindows(11);
		dbr.setWallmaterial("Brick And Cement Plastered");
		dbr.setAreaOfBuilding(2222);
		
		System.out.println(dbr.toString());
		
		
		Hut hut=new Hut();
		hut.setNumberOfDoors(1);
		hut.setNumberOfWindows(3);
		hut.setWallmaterial("Bricks with Mud and soil");
		hut.setAreaOfBuilding(300);
		System.out.println(hut.toString());
	}

}
