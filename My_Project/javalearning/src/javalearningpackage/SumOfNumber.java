package javalearningpackage;

//find sum of natural numbers from 1 to n

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumber na = new SumOfNumber();
		na.sum(10);
	}
	public  void sum(int num)
	{
		int i = 1;
		int sum =0;
		while(i <= num)
		{
		sum = sum +i;	
         i++;
		}
		System.out.println("sum of is: "+sum);
	}

}
