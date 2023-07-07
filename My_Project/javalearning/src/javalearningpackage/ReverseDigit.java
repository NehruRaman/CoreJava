package javalearningpackage;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDigit na = new ReverseDigit();
		na.reverseDigit(5647);
	}
public void reverseDigit(int num) {
	System.out.println("Number of Reverse: " + num);
		int reverse = 0;
		while (num != 0) {
			int n = num % 10;
			reverse = (reverse * 10)+n ;
			num = num / 10;
		}
    

    
		System.out.println("Number of Reverse: " + reverse);
	}

}
