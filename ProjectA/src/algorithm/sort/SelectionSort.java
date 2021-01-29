package algorithm.sort;

import algorithm.sort.ref.ValueClass;

public class SelectionSort {

	public static void main(String[] args) {
		int min = 0;
		int index = 0;
		int temp = 0;
		int array[] = ValueClass.ARRAY; 

		for(int i=0; i< 10; i++) {
			min = 9999;
			for(int j = i; j< 10; j++) {
				if(min>array[j]) {
					min = array[j];
					index = j;
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		ValueClass.print(array);
		
	}

}
