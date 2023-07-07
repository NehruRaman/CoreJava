package javalearningpackage;

public class ReversePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversePrime na = new ReversePrime();
		na.reverseprime(92);
		na.reverseprime(12);
		
	}
	public void reverseprime (int num) {
		  int reverse = 0;
		  int i =2;
		  boolean flag = true;
		  while(num > 0)
		  {
			  int n = num % 10;
				reverse = (reverse *10) +n ;
				num = num / 10;
		  }
		      num = reverse; 
			
			while (i < num) {
					
			if(num % i == 0) 
			{
			 flag = false;
			}
			i++;
			
			}
			if(flag == true)
			{
		     System.out.println("primre Number is: " + num);	
			}
			else
			{
				System.out.println("Not prime  Number is: " + num);	
			}
			}

}
