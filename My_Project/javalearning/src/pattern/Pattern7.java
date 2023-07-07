package pattern;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern7 na = new Pattern7 ();
		na.pattern();

	}
	public void pattern()
	{
		int num = 1;
	     
		for(int row = 1;row <= 5;row++)
		{
			for(int col = 1;col <= 5 ;col++)
			{
				
		   System.out.print(num);
			
	     num = num+2;
			} 
      System.out.println("");
	}
}

}
