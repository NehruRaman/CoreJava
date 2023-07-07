package javalearningpackage;

public class DivisibleBy9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleBy9 na = new DivisibleBy9();
		na.divisible();
	}
public void divisible()
{
	int range = 250;
	while(range <= 300)
	{
		if(range%9 == 0)
		{
			System.out.println("divisible 9 is: "+range);
		}
		range ++;
	}
	
}
}
