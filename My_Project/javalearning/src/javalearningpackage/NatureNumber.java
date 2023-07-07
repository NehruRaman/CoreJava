package javalearningpackage;

/*print all natural numbers from 1 to n. – using while loop
where n is the number given by the user.*/


public class NatureNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NatureNumber na = new NatureNumber();
		na.nature(10);
	}

	public  void nature(int num)
	{
		int i = 1;
		while(i <= num)
		{
			System.out.println("Nature number is: "+i);
         i++;
		}
		
	}
}
