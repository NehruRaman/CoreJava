package array;
import java.util.Scanner;
public class Array_Even_odd {
     int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Even_odd na = new Array_Even_odd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Elements");
	    na. size = sc.nextInt();
	    na.even(na.size);

	}
	public void even(int size)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Studenrt age : ");
	int []even = new int[size];
	
	for(int i = 0;i<even.length;i++)
	{
		even[i]= sc.nextInt();
		if(even[i]%2==0)
		{
			System.out.println("Even number is:"+even[i]);
		}
		else
		{
			System.out.println("o number is:"+even[i]);	
		}
	}
	}
}
