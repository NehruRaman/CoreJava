package oopsconcept;
import java.util.Scanner;
public class EBill {
	  String cus_EB_Number;
      String cus_Name;
      int units;
      double billamt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBill na = new EBill("cus_EB_Number","cus_Name");
	
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Your EB Number");
        na.cus_EB_Number  = scanner.next();
        System.out.println("Enter The your Name");
         na.cus_Name = scanner.next();
       System.out.println("Enter The Your EBbill Unit");
        na.units = scanner.nextInt();
        na.ebill(na.units);
        na.display();
        scanner.close();
      
	}
public EBill(String cus_EB_Number,String cus_Name )
{
	this.cus_EB_Number = cus_EB_Number;
	this.cus_Name = cus_Name;

}
public void ebill(int units)
{
	this.units = units;
	if(units > 0 && units <=100)
	{
		System.out.println("free for 100 unit");
	}
	if(units > 100 && units <= 200)
	{
		billamt = (units -100) *2.25;
	}
	if(units > 200 && units <=400)
	{
		billamt =  ((200-100)*2.25) + (units - 200) *4.50;
		
	}
	else if (units > 400 && units <= 500)
	{
		billamt = ((200-100)*2.25) + ((400-200)*4.50) + (units-400)*6;
	}
	System.out.println("total EBill Amount: "+billamt);
	
}
public void display()
{
	System.out.println("Customer EBid: "+cus_EB_Number);
	System.out.println("Customer Name: "+cus_Name);
	System.out.println("total Unit: "+units);
	System.out.println("total EBill Amount: "+billamt);
}
}
