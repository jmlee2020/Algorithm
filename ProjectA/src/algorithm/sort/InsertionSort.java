package algorithm.sort;

import algorithm.sort.ref.ValueClass;

public class InsertionSort {
	
	public static void main(String[] args) {
	
		int[] array = ValueClass.ARRAY;
		int size = array.length - 1;
		
		for(int i= 0; i< size; i++) {
			int j = i;
			while(array[j] > array[j+1]) {
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
			
			
		}
		
		ValueClass.print(array);
		
	}

}
