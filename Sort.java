package cycle2;
import java.util.*;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String [] array1= new String[5]; 
		System.out.println("Enter elements:");
		for(int i=0;i<5;i++) {
			array1[i]=s.nextLine();
		}
		System.out.println("Elements are:");
		for(int i=0;i<5;i++) {
			System.out.print(array1[i]+"\t");
		}
		// TODO Auto-generated method stub
		Arrays.sort(array1);
		System.out.println("\nSorted array:");
		System.out.println(Arrays.toString(array1));
	}

}
