package com.gl.javafsd.dsa.floor_sizes.calculation_output;

public class FloorSizeSorter {

	// instance variable
	int[] descendingSortedFloorSizeArr;

	// Constructor
	public FloorSizeSorter(int[] forSortingFloorSize) {

		this.descendingSortedFloorSizeArr = forSortingFloorSize;
	}

	// Descending order sorting done
	public int[] getDescendingSortedFloorSizeArr() {
		return descendingSortedFloorSizeArr;
	}

	public void setDescendingSortedFloorSizeArr(int[] descendingSortedFloorSizeArr) {
		this.descendingSortedFloorSizeArr = descendingSortedFloorSizeArr;
	}

	public int[] sort(int[] forSortingFloorSize) {

		int size = forSortingFloorSize.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (forSortingFloorSize[j - 1] < forSortingFloorSize[j]) {
					// swap elements
					temp = forSortingFloorSize[j - 1];
					forSortingFloorSize[j - 1] = forSortingFloorSize[j];
					forSortingFloorSize[j] = temp;

				}
			}
		}
		return forSortingFloorSize;
	}

}
