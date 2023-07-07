package pattern;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern15 na = new Pattern15();
		na.pattern();
 
		
	}
	public void pattern()
	{
		for(int row = 1;row<=5;row=row+2)
		{
			for(int space = 4;space > row ;space=space-2)
			{
				System.out.print(" ");
			}
			for(int col = 1;col <= row;col++)
			{
				System.out.print(col);
			}
			System.out.println("");
		}
	}

}
