package pattern;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Pattern12 na = new Pattern12();
	na.pattern();

}

public void pattern() {
        int num, n = 5;
	for (int row = 1; row <= 5; row++) {
		num = row;
		for (int col = 1; col <= 5;  col++) {

			System.out.print(num+" ");
         num = num +n; 
		}
		System.out.println(" ");

	}

}
}
