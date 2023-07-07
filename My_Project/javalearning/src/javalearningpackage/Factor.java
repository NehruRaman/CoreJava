package javalearningpackage;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factor na = new Factor();
		na.factor(24);
		na.factor(35);

	}
	public void factor (int num) {
		
		  int i =2;
			
			while (i <= num) {
				
			if(num % i == 0)
			{
			System.out.println("Factor Number is: " + i);	
			}
		
			i++;
			
			}
       }
}