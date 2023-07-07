package javalearningpackage;
//print natural numbers in reverse from n to 1

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber na = new ReverseNumber();
		na.reverse(10);
	}
	public  void reverse(int num)
	{
		
		while(num > 0)
		{
			System.out.println("Nature number is: "+num);
         num--;
		}
		
	}
}
