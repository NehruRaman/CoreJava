package javalearningpackage;

public class FibonacciSerias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSerias na = new FibonacciSerias();
		na.fabonacci(10);

	}
	public void fabonacci(int range)
	{
		int first =0;
		int second = 1;
		int ans = 0;
		int i = 0;
		System.out.println("first:"+first+"second: "+second);
		while(i < range)
		{
			ans = first+second;
			first = second;
			second = ans;
			i++;
		}
		System.out.println(" Fibonacci Number is : "+ans);
	}

}
