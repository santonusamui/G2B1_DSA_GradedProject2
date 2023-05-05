package com.gl.javafsd.dsa.floor_sizes_calculation.test;

import com.gl.javafsd.dsa.floor_sizes.calculation_output.FloorPipelineMatching;
import com.gl.javafsd.dsa.floor_sizes.calculation_output.FloorSizeSorter;

public class FloorPipelineMatchingTest {

	public static void main(String[] args) {

		// int[] floorSizeArr = {3,1,2};
		// int[] floorSizeArr1 = {3,1,2};
		// int[] sortedFloorSizeArr = {3,2,1};
		//
		// int[] floorSizeArr = {4,5,1,2,3};
		// int[] floorSizeArr1 = {4,5,1,2,3};
		// int[] descendingSortedFloorSizeArr = {5,4,3,2,1};

		// int[] floorSizeArr = {3,2,1,5,4};
		// int[] floorSizeArr1 = {3,2,1,5,4};
		// int[] descendingSortedFloorSizeArr = {5,4,3,2,1};

		// int[] floorSizeArr = {1,2,3,8,9,10,4,5,7,6};
		// int[] floorSizeArr1 = {1,2,3,8,9,10,4,5,7,6};
		// int[] descendingSortedFloorSizeArr = {10,9,8,7,6,5,4,3,2,1};

		// int[] floorSizeArr = {1,6,8,4,10,9,5,2,3,7};
		// int[] floorSizeArr1 = {1,6,8,4,10,9,5,2,3,7};
		// int[] descendingSortedFloorSizeArr = {10,9,8,7,6,5,4,3,2,1};

		// int[] floorSizeArr = {15,7,9,2,14,10,5,8,1};
		// int[] floorSizeArr1 = {15,7,9,2,14,10,5,8,1};
		// int[] descendingSortedFloorSizeArr = {15,14,10,9,8,7,5,2,1};

		// int[] floorSizeArr = {10,9,8,7,6,5,4,3,2,1};
		// int[] floorSizeArr1 = {10,9,8,7,6,5,4,3,2,1};
		// int[] descendingSortedFloorSizeArr = {10,9,8,7,6,5,4,3,2,1};

		int[] floorSizeArr = { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 };
		int[] floorSizeArr1 = { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 };
		// int[] descendingSortedFloorSizeArr = {10,9,8,7,6,5,4,3,2,1};

		FloorSizeSorter sorter = new FloorSizeSorter(floorSizeArr1);
		int[] sortedFloorSizeArr = sorter.sort(floorSizeArr1);

		FloorPipelineMatching compute = new FloorPipelineMatching(floorSizeArr, sortedFloorSizeArr);
		compute.process(floorSizeArr, sortedFloorSizeArr);

	}
}