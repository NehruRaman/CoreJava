package pattern;

public class pattern5 {

	public static void main(String[] args)
		{
		pattern5 na = new pattern5();
		na.pattern();
		
	}
		// TODO Auto-generated method stub
		public void pattern()
		{
			int num = 1;
		     
			for(int row = 1;row <= 5;row++)
			{
				for(int col = 1;col <= 5 ;col++)
				{
					
			   System.out.print(num);
				
		     num++;
				} 
	      System.out.println("");
		}
	}
}

