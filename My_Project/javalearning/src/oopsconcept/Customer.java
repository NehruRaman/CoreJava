package oopsconcept;

public class Customer {
	private String accno;
	private String cusname;
	private String panno;
	private long balance;
	private String branch_name;
	private String ifc_code;
//no arguments Constructor
	Customer() {
		this.ifc_code = "KKBK0000462";
		this.branch_name = "Velachery";
		System.out.println("Branch Name is : " +branch_name );
		System.out.println("IFC_code is : " +ifc_code);
	}
	// arguments Constructor

	Customer(String accno, String cusname, String panno, long balance) {
		this();
		this.accno = accno;
		this.cusname = cusname;
		this.panno = panno;
		this.balance = balance;
 }
   //setter method
	public void setAccno(String accno) {
		this.accno = accno;
	}
    // getter method
	 String getAccno() {
		return accno;
	}
	 //setter method
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	
	// getter method
	String getCusname() {
		return cusname;
	}
	 //setter method
	public void setAccno(long balance) {
		this.balance = balance;
	}
	// getter method
	 long getBalance() {
		return balance;
	}
	 //setter method
	public void setPanNO(String panno) {
		this.panno = panno;
	}
	// getter method
	 String getPanNo() {
		return panno;
	}

	public void loan() {
		if (balance > 10000) {
			System.out.println("your Eligible for loan");
		} else {
			System.out.println("Not Eligible for loan");
		}
	}

	public void display() {
		//Customer na = new Customer();// no arguments Constructor object initialization
		System.out.println("Account Number: " + accno);
		System.out.println("Customer Name:  " + cusname);
		System.out.println("pan Number is : " + panno);
		System.out.println("BankBalance is : " + balance);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
