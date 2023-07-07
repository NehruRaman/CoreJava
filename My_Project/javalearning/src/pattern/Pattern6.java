package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern6 na = new Pattern6();
		na.pattern();
	}
	public void pattern()
	{
	     
		for(int row = 1;row <= 5;row++)
		{
			for(int col = 5;col >= 1 ;col--)
			{
				
		   System.out.print(col);
			
			} 
      System.out.println("");
	}
}

}
