package oopsconcept;

interface Bank1				
{	int limit = 40000;		
	void roi();	 
}

class AxisBank implements Bank1 
{	public void roi()
	{	System.out.println("Axis Bank ROI 9.99.... withdraw Limit"+Bank1.limit);
	}
}

class SbiBank implements Bank1 
{	public void roi()
	{	System.out.println("SBI Bank ROI 11.99.... withdraw Limit"+Bank1.limit);
	}
}

