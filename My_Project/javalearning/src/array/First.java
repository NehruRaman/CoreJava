package array;
import java.util.Scanner;
//***************************************
//input user insert size and values
//**********************************
public class First {
     int sum=0;
     int size ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First na = new First();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Elements");
	   na. size = sc.nextInt();
        na.age(na.size);
       //na.reverse(na.size);

	}
	public void age(int size)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter The Studenrt age : ");
	 int []age = new int[size];
		for(int i =0; i < size;i++)
		{
			
		    age[i] = sc.nextInt();
		}
		for(int i = 0;i < size;i++)
		{
			sum = sum + age[i]; 
			System.out.println(age[i]);
		}
		System.out.println("Sum Of Student Age"+sum);
         int average = sum /size;
         System.out.println("Average Age of Student"+average);
         for(int i = age.length-1;i>=0;i--)
 		{
        
 			System.out.println("Enter the Reverse:"+age[i]);
 		}
         
	}
	/*public void reverse(int size)
	{
		int []reverse = new int[size];
		for(int i = reverse.length-1;i>=0;i--)
		{
			System.out.println("Enter the Reverse:"+reverse[i]);
		}
	}*/
}
