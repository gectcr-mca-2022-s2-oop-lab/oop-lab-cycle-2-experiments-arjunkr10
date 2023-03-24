package viva;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int [] array1=new int[5];
		System.out.println("enter elements:");
		for(int i=0;i<5;i++) {
			array1[i]=s.nextInt();
		}
		int sum=0;
		for(int i:array1) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	}

}
