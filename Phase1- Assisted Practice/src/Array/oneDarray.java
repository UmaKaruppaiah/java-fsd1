package Array;
import java.util.Scanner;
public class oneDarray {
	public static void main(String[] args)
	 {
	 int n;
	 Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements you want to store: ");
	 n=sc.nextInt(); //reading the number of elements from the that we want to ente
	 int array[] = new int[10]; //creates an array in the memory of length 10
	 System.out.println("Enter the elements of the array: ");
	 for(int i=0; i<n; i++)
	 {
	 array[i]=sc.nextInt(); //reading array elements from the user
	 }
	 System.out.println("Array elements are: ");
	 // accessing array elements using the for loop
	 for (int i=0; i<n; i++)
	 {
	 System.out.println(array[i]);
	 }
	 } 

}
