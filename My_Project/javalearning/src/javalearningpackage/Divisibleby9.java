package javalearningpackage;

public class Divisibleby9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisibleby9 na = new Divisibleby9();
		na.divisible();

	}
	public void divisible()
	{
		int num = 1;
		int count = 0;
		while(num <= 100)
		{
			if(num % 9 ==0)
			{
				count++;
			}
			num ++;
		}
		System.out.println("divisor of 9 is: "+count);
	}

}
