package javalearningpackage;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lcm na = new Lcm();
		na.lcm();
	}
	public void lcm()
	{
		int input1 = 20;
		int input2 = 30;
		int large = input1  > input2 ? input1:input2;
		while(true)
		{
			if(large % input1==0 && large % input2 == 0)
			{
				break;
			}
		large++;
		}
    System.out.println("LCM values is: "+large);
	}

}
