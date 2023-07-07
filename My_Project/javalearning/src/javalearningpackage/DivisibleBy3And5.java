package javalearningpackage;

public class DivisibleBy3And5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleBy3And5 na = new DivisibleBy3And5();
		na.divisible();
	}
public void divisible()
{
	int num = 1;
	while(num <= 100)
	{
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("divisible by 3 and 5 is: "+num);
		}
		num ++;
	}
	
}

}
