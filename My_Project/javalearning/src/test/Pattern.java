package test;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern na = new Pattern();
		na.pattern();

	}
    public void pattern()
    {
    for(int row = 1;row<=4;row++)
    {
    for(int col =1;col<=4;col++)
    {
    	if(row == 1)
    	{
    		
    	System.out.print("a"); 
    	}
    	else if(row == 2)
    	{
    		
    	System.out.print("b"); 
    	}
    	else if(row == 3)
    	{
    		
    	System.out.print("c"); 
    	}
    	else
    	{
    		
    	System.out.print("d"); 
    	}
    	}
    System.out.println(" "); 
    }
    }
}
