package javalearningpackage;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polindrome na = new Polindrome();
		na.polindrome(121);
		na.polindrome(453);

	}
	public void polindrome (int num) {
		
		   int polindrome =num;
			int reverse = 0;
			while (num != 0) {
				int n = num % 10;
				reverse = (reverse * 10)+n ;
				num = num / 10;
			}
			if(polindrome == reverse)
			{
			System.out.println("Polindrome Number is: " + reverse);	
			}
			else
			{
			System.out.println("Not Polindrome Number is : " + reverse);
			}
}
}
