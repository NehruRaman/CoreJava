package javalearningpackage;

public class Hcf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hcf3 na = new Hcf3();
		na.hcf3();
	}
	public void hcf3()
	{
		int input1 = 20;
		int input2 = 30;
		int input3 = 40;
		int small = input1  < input2 ? (input1 < input3 ? input1:input3):(input2 > input3 ? input2:input3);
		while(small >= 2)
		{
			if( input1 % small ==0 &&  input2 % small == 0 &&  input3 % small == 0)
			{
				break;
			}
		small--;
		}
      System.out.println("Hcf Three Number is :"+small);
      }
}