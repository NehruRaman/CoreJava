package oopsconcept;

public class Magan extends Appa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magan na = new Magan();
		na.bankBalance(200000);
		na.assets("house");
		//na.occupation("unemployee","marketing");
        na.occupation("farmer");
        na.occupation("business");
	}
	public void occupation (String work)
	  {
		
		  System.out.println("My occupation: "+work); 
	  }

}
