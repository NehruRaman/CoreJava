package javalearningpackage;

public class FibonacciWithOutVariable {


public static void main(String arg [])
{
	FibonacciWithOutVariable na = new FibonacciWithOutVariable();
	na.fibonacci(10);
}
public void fibonacci(int range)
{
	int first =0;
	int second = 1;
	int i = 0;
	System.out.println("first:"+first+"second: "+second);
	while(i < range)
	{
		
		second = first+second;
		first = second - first;
		System.out.println(" Fibonacci Number is : "+second);
		i++;
	}
	/*if(range >= 1)
	{
		System.out.println(" Fibonacci Number is : "+second);
	
	if(range >= 2)
	{
		System.out.println(" Fibonacci Number is : "+second);
	}
	}*/
	System.out.println(" Fibonacci Number is : "+second);
}


}