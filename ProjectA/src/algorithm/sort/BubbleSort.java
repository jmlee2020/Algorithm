package algorithm.sort;

import algorithm.sort.ref.ValueClass;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = ValueClass.ARRAY;
		int size = array.length;
		
		for(int i = 0; i< size; i++) {
			for(int j = 0; j< size; j++) {
				if(array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		ValueClass.print(array);


	}

}
