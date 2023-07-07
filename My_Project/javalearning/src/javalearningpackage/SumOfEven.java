package javalearningpackage;

//find sum of even numbers from 1 to n

public class SumOfEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfEven na = new SumOfEven();
		na.sumofeven(10);
	}
	public  void sumofeven(int num)
	{
		int i = 0;
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
