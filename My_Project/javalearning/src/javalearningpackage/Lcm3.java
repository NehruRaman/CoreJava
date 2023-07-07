package javalearningpackage;

public class Lcm3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lcm3 na = new Lcm3();
		na.lcm();
	}
	public void lcm()
	{
		int input1 = 20;
		int input2 = 30;
		int input3 = 40;
		int large = input1  > input2 ? (input1 > input3 ? input1:input3):(input2 > input3 ? input2:input3);
		while(true)
		{
			if(large % input1==0 && large % input2 == 0 && large % input3 == 0)
			{
				break;
			}
		large++;
		}
    System.out.println("LCM values is: "+large);
	}


}
