package cycle2;

import java.util.*;

public class Search {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		int[] array1 = new int[20];

		int flag = 0, count = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter array elements:");

		for (int i = 0; i < 10; i++)

		{

			array1[i] = s.nextInt();

		}

		System.out.println("Array elements are:\t");

		for (int i = 0; i < 10; i++) {

			System.out.print(array1[i] + "\t");

		}

		System.out.println("\nEnter element to search:");

		int n = s.nextInt();

		for (int i = 0; i < 10; i++) {

			count = count + 1;

			if (array1[i] == n) {

				flag = 1;

				break;

			}

			else {

				flag = 0;

			}

		}

		if (flag == 1) {

			System.out.println("Element found at " + count);

		}

		else {

			System.out.println("Element not found");

		}
		
		s.close();

	}
	


}