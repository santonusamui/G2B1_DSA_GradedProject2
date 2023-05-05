package com.gl.javafsd.dsa.floor_sizes.calculation_output;

public class FloorPipelineMatching {

	int[] floorSizeArr;
	int[] descendingSortedFloorSizeArr;

	public FloorPipelineMatching(int[] floorSizeArr2, int[] descendingSortedFloorSizeArr2) {

		this.floorSizeArr = floorSizeArr2;
		this.descendingSortedFloorSizeArr = descendingSortedFloorSizeArr2;
	}

	public int[] getFloorSizeArr() {
		return floorSizeArr;
	}

	public void setFloorSizeArr(int[] floorSizeArr) {
		this.floorSizeArr = floorSizeArr;
	}

	public int[] getDescendingSortedFloorSizeArr() {
		return descendingSortedFloorSizeArr;
	}

	public void setDescendingSortedFloorSizeArr(int[] descendingSortedFloorSizeArr) {
		this.descendingSortedFloorSizeArr = descendingSortedFloorSizeArr;
	}

	public void process(int[] floorSizeArr2, int[] descendingSortedFloorSizeArr2) {

		int i;
		int j = 0;
		int matchCount = 0;

		System.out.println();
		System.out.println("The order of construction is as follows :");

		for (i = 0; i <= (floorSizeArr2.length - 1); i++) {

			int day = i;

			System.out.println();
			// match scenario
			if (descendingSortedFloorSizeArr2[j] == floorSizeArr2[i]) {

				System.out.println();
				System.out.println("Day:" + (++day));
				System.out.println();

				System.out.print(descendingSortedFloorSizeArr2[j]);

				int temp1 = j;
				int temp2 = i;

				outer: for (int l = (temp1 + 1); l <= (temp2); l++) {

					boolean flag = false;

					inner: for (int k = (temp2 - 1); k >= 0; k--) {
						// match scenario
						if (descendingSortedFloorSizeArr2[l] == floorSizeArr2[k]) {
							matchCount++;
							flag = true;
							break inner;

						}

					}
					if (flag)
						continue outer;
					else
						break outer;

				}

				j++;

				// prints matching floor size(s), encountered before recent greatest floor size.
				while (matchCount != 0) {

					System.out.print(",");
					System.out.print(descendingSortedFloorSizeArr2[j]);
					matchCount--;
					j++;
				}
				// no match scenario
			} else {
				System.out.println();
				System.out.println("Day:" + (++day));
				System.out.println("");

			}
		}

	}

}
