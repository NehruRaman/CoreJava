package test;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd na = new EvenOdd();
		na.even(43);
	}
	public void even(int num)
	{
	
		int count = 0;
		int sum1 =0;
		int sum2 = 0;
		while(num > 0)
		{
			int n = num%10;
			count++;
			if(count%2==0)
			{
				sum1 = sum1 +n;
			}
			else
			{
				sum2 = sum2 + n;
			}
			
				num = num/10;
		}
		System.out.println("odd - even: "+sum1);
		System.out.println("odd - even: "+sum2);
		sum2 = sum2-sum1;
		System.out.println("odd - even: "+sum2);
	}

}
