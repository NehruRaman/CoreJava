package oopsconcept;

public class calc extends Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc na = new calc();
        na.add(30, 20);
        na.sub(40, 10);
        na.mul(40, 20);
        na.div(50, 5);
        na.display();
	}
	public void display()
	{
		System.out.println("Welcome calc");
	}
}
