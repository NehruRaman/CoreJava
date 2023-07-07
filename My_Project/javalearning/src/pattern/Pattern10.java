package pattern;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern10 na = new Pattern10();
		na.pattern();

	

	}
	public void pattern()
	{


	for(
	int row = 1;row<=5;row++)
	{
		for (int col = 1; col <= 3; col++) {

			System.out.print(col+""+row);

			
		}
		System.out.println();
	}

}
}
