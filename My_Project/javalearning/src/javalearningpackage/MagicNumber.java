package javalearningpackage;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicNumber na = new MagicNumber();
		na.magicNumber(1458);
		na.magicNumber(1634);
	}

	public void magicNumber(int num) {
		int temp = num;
		int sum = 0;
		int product = 0;
		int reverse = 0;
		while (num > 0) {
			int n = num % 10;
			sum = sum + n;
			num = num / 10;
		}
		int sum1 = sum; 
		while(sum1 > 0)
		{
			int n = sum1 % 10;
			reverse = (reverse * 10)+ n;
			sum1 = sum1 / 10;
		}
		product = sum * reverse;
		if (product == temp) {
			System.out.println("Magic Number is: " + product);
		} else {
			System.out.println("Not Magic Number is: " + product);
		}

	}

}
