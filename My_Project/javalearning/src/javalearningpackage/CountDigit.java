package javalearningpackage;

//count number of digits in an integer

public class CountDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigit na = new CountDigit();
		na.countDigit(5647);
	}

	public  void countDigit(int num)
	{

		int count =0;
		while(num > 0)
		{
		int n = num % 10;	
	    count++;
	    num = num / 10;
		}
		System.out.println("Count Number of Digit: "+count);
     }
}
