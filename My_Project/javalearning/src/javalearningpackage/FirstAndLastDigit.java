package javalearningpackage;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstAndLastDigit na = new FirstAndLastDigit();
		na.firstAndLastDigit(35645);
	}

	public void firstAndLastDigit(int num) {
		int firstdigit = 0;
		int lastdigit = 0;
		lastdigit = num % 10;
		while (num != 0) {
			firstdigit = num;
			num = num / 10;
		}
    
		System.out.println("First Digit: " + firstdigit);
		System.out.println("Last Digit: " + lastdigit);
	}
}
