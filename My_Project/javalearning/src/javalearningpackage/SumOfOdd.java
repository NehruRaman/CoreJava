package javalearningpackage;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfOdd na = new SumOfOdd();
		na.sumofodd(10);
	}

	public  void sumofodd(int num)
	{
		int i = 1;
		int sum =0;
		while(i <= num)
		{
		sum = sum +i;	
		System.out.println("Even number is: "+i);
         i += 2;
		}
		System.out.println("sum of Even Number is: "+sum);
	}
}
