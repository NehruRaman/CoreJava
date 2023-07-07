package pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern9 na = new Pattern9();
		na.pattern();

	}
	public void pattern()
	{
		for(int row =1;row<=5;row++)
		{
			for(int col =1;col<=5;col++)
			{
			
				System.out.print(row*col);			
				}
			System.out.println(" ");
			}
		
	}
	

}
