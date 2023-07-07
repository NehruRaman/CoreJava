package pattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern13 na = new Pattern13();
		na.pattern();

	}
	public void pattern() {
        int x,y, n = 5;
	for (int row = 1; row <= n; row++) {
		x = row;
		y = n - row + 1;
		for (int col = 1; col <= n;  col++) {
      if(col % 2 == 1)
      {
    	  System.out.print(x+" ");  
      }
      else
      {
			System.out.print(y+" ");
      }
         x = x +n; 
         y = y +n; 
		}
		System.out.println(" ");
		}
	}
}

