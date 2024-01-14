package com.javaenumtypes;

public class CardinalDirections {

	public enum Direction {
		NORTH, SOUTH, EAST, WEST
	}

	public static void main(String[] args) {

		Direction d1 = Direction.NORTH;
		Direction d2 = Direction.WEST;
		Direction d3 = Direction.SOUTH;
		Direction d4 = Direction.EAST;

		System.out.println("First direction is: " + d1);
		System.out.println("Second direction is: " + d2);
		System.out.println("Third direction is: " + d3);
		System.out.println("Fourth direction is: " + d4);

	}

}
