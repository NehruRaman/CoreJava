package javalearningpackage;

public class Divisible7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible7 na = new Divisible7();
		na.divisible();

	}
	public void divisible()
	{
		int num = 1;
		while(num <= 500)
		{
			if(num % 7 == 0 && num >= 450)
			{
				System.out.println("divisible by 3 and 5 is: "+num);
			}
			num ++;
		}
	}
}
