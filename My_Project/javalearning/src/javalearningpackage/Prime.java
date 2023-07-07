package javalearningpackage;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime na = new Prime();
		na.prime(7);
		na.prime(12);
	}
	public void prime (int num) {
		
		  int i =2;
		  boolean flag = true;
			
			while (i < num) {
				
			if(num % i == 0)
			{
			 
			//System.out.println("primre Number is: " + i);
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


