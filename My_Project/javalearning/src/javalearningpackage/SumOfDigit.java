package javalearningpackage;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigit na = new SumOfDigit();
         na.sumOfDigit(6756);
	}
	public void sumOfDigit(int num) {
		
		int sum = 0;
		while (num != 0) {
			int n = num % 10;
			sum +=n;
			num = num / 10;
		}
    
		System.out.println("First Digit: " + sum);
	}
}
