package nz.vuw.ac.mapleyhayl.ArrayList;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		numbers.printList();
		numbers.add(0, 0);
//		List<Integer> testList = new java.util.ArrayList<Integer>();
//		testList.add(4);
//		testList.add(3);
		System.out.println(numbers.size());
		System.out.println(numbers.getSize());
	}

}
