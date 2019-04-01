
package com.lambda;

import java.util.Comparator;

public class LambdaClass {

	public static void main(String args[]) {

		LambdaInterface inter_face = (a, b) -> {
			return a + b;
		};
		System.out.println("Addition result :: "+ inter_face.add(10, 20));

		Comparator<Integer> intComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer int1, Integer int2) {
				if (int1 < int2)
					return -1;
				else if (int1 > int2)
					return 1;
				else
					return 0;
			}

		};
		
		Comparator<Integer> intComparator1 = (a, b) ->{return a-b;};

		System.out.println("Comparision Result :: "+intComparator1.compare(20, 10));

		inter_face.displayStirng("Welcome !!");
	}

}
