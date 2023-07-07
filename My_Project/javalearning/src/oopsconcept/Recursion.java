package oopsconcept;

public class Recursion {
	int first = -1;
	int second = 1;
	int third;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion na = new Recursion();
		int n = na.fibonacci(1);
        System.out.println(n);
	}
	public int fibonacci(int num )
	{
		int third; 
		if(num == 10)
		{
		return 10;
		}
		third = first + second;
		first = second;
		second = third;
		System.out.println("Answer is: "+third);
		return fibonacci(num+1);
		
		
	}

}
