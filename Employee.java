package cycle2;
import java.util.*;
class Employee {
	
	int eno;
	int esalary;
	String ename;
	
	Employee(int eno,String ename,int esalary){
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	 public String toString() {
		 
		 System.out.println("Employee id Employee name Employee salary");
		 return eno +"             "+ename+"       "+esalary;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,c;
		String b;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of employees:\n");
		n=s.nextInt();
		
		Employee[] arr =new Employee[n];
		
		
		
		for(int i=0;i<n;i++) {
			System.out.printf("Enter employee %d id:\n",i);
			a=s.nextInt();
			System.out.printf("Enter employee %d name:\n",i);
			b=s.next();
			System.out.printf("Enter employee %d salary:\n",i);
			c=s.nextInt();
			arr[i]= new Employee(a,b,c);
		}
		System.out.println("Employee details:\n");
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);

}}}