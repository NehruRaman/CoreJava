package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern11 na = new Pattern11();
		na.pattern();

	}

	public void pattern() {

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 3; col++) {

				System.out.print(row + " " + col+ " ");

			}

			System.out.println("");

		}

	}
}