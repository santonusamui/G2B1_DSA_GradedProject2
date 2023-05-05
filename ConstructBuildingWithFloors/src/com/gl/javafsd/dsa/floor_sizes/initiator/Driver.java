package com.gl.javafsd.dsa.floor_sizes.initiator;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.gl.javafsd.dsa.floor_sizes.calculation_output.FloorPipelineMatching;
import com.gl.javafsd.dsa.floor_sizes.calculation_output.FloorSizeSorter;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total numbers of floors in the building: ");
		int noOfFloors = 0;
		try {
			noOfFloors = scan.nextInt();
		} catch (InputMismatchException e) {

			System.out.println("You have NOT ENTERED POSITIVE INTEGER for numbers of floors in the building!!! ");
			System.out.println("SO THE APPLICATION TERMINATES!!!");
			System.exit(-1);
		}
		if (noOfFloors == 0 || noOfFloors < 0) {
			System.out.println("You have NOT ENTERED POSITIVE INTEGER for numbers of floors in the building!!! ");
			System.out.println("SO THE APPLICATION TERMINATES!!!");
			System.exit(-1);
		}
		int[] floorSizeArr = new int[noOfFloors];
		int[] forSortingFloorSize = new int[noOfFloors];

		System.out.println("Please enter only positive integer value for floor size...");
		System.out.println();
		try {
			for (int i = 0; i < noOfFloors; i++) {

				int day = i;
				System.out.println("Enter the floor size given on day :" + (++day));
				int floorValue = scan.nextInt();
				floorSizeArr[i] = floorValue;
				forSortingFloorSize[i] = floorValue;

				// checks for zero input
				while (floorSizeArr[i] == 0) {

					System.out.println("You have entered zero as floor size");
					System.out.println("Please enter a positive integer value for day:" + (day));
					floorValue = scan.nextInt();
					floorSizeArr[i] = floorValue;
					forSortingFloorSize[i] = floorValue;

				}
				
				// checks for negative inputs
				while (floorSizeArr[i] < 0) {

					System.out.println("You have entered negetive number as floor size");
					System.out.println("Please enter a positive integer value for day:" + (day));
					floorValue = scan.nextInt();
					floorSizeArr[i] = floorValue;
					forSortingFloorSize[i] = floorValue;

				}
				
				// checks for duplicate inputs
				boolean flag;
				do {
					flag = false;

					for (int j = 0; j < i; j++) {
						if (floorSizeArr[j] == floorSizeArr[i]) {
							flag = true;
							System.out.println("You have entered duplicate floor size");
							System.out.println("Please enter again a diffrent value for day:" + (day));
							floorValue = scan.nextInt();
							floorSizeArr[i] = floorValue;
							forSortingFloorSize[i] = floorValue;
						}

					}
				} while (flag);

			}
		} catch (InputMismatchException e) {

			System.out.println("You have NOT ENTERED POSITIVE INTEGER for the Floor Size!!!! ");
			System.out.println("SO THE APPLICATION TERMINATES!!!");
			System.exit(-1);
		}
		scan.close();

		FloorSizeSorter sorter = new FloorSizeSorter(forSortingFloorSize);

		int[] descendingSortedFloorSizeArr = sorter.sort(forSortingFloorSize);

		FloorPipelineMatching compute = new FloorPipelineMatching(floorSizeArr, descendingSortedFloorSizeArr);
		compute.process(floorSizeArr, descendingSortedFloorSizeArr);

	}

}
