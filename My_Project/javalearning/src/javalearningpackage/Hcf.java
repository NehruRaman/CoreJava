package javalearningpackage;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hcf  na = new Hcf();
		na.hcf();

	}
	public void hcf()
	{
		int input1 = 20;
		int input2 = 30;
		int small = input1  < input2 ? input1:input2;

		while( small >= 2)
		{
			if( input1 % small == 0 && input2 % small == 0)
			{
				System.out.println("Hcf Number is: "+small);
				break;
			}
		small--;
		}
		System.out.println("Hcf Number is: "+small);
      }
}