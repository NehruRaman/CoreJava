package javalearningpackage;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial na = new Factorial();
		na.factorial(4);

	}
	public void factorial(int num)

	{
		int fact = 0;
		while(num > 0)
		{
			//int n = num%10;
			fact = fact+(num*num);
			System.out.println("factorial Number is:  " +num);
			//num = num/10;
			num--;
	    }
		System.out.println("factorial Number is:  " +fact);
	}
}
