package javalearningpackage;

public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Neon na = new Neon();
		na.neon(10);
	}
	public void neon(int num)
	{
	int sum = 0;
	int n = num*num;
	 while(n>0)
	 {
		 int mod = n % 10;
		 sum = sum + mod;
		 n = n / 10;
	 }
	 if(sum == num)
	 {
	  System.out.println("Neon Number is: "+sum);	 
	 }
	 else
	 {
	 System.out.println("Not Neon Number is: "+sum); 
	 }
	}
}
