package javalearningpackage;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong  na = new Armstrong();
		na.armstrong(324);
		na.armstrong(1634);
	}

	public void armstrong(int num) {
		int temp = num;
		int armstrong = 0;
		while (num > 0) {
			int n = num % 10;
			armstrong = armstrong + (n * n * n * n);
			num = num / 10;
		}
		if (armstrong == temp) {
			System.out.println("Armstrong Number is: " + armstrong );
		}
		else {
			System.out.println("Not Armstrong  Number is: " + armstrong);
		}

	}
}
