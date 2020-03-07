package com.isi.java.sortedarray;

public class DynamicSorting extends AbstractSortedArray {

	private ISorter sorter=SortingAlgorithems.BubbleSorter;
	public DynamicSorting(int size) {
		super(size);
		
		
	}

	public DynamicSorting(int arr[]) {
		super(arr);
	}
public void setSorter(ISorter sorter) {
	this.sorter=sorter;
}
	@Override
	public void sort() {

		sorter.sort(array);
	}

}
