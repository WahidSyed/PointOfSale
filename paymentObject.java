public class paymentObject extends Object
{

	private double pay;
	private double tot;

// Payment object initialization
	public paymentObject()
	{
		pay = 0;
		tot = 0;

	}

// Payment object calculation
	public paymentObject(double pay, double tot)
	{
		this.pay=pay;
		this.tot=tot;
	}

	public double payment()
	{
		    double change=0;

		    if(pay>tot)
			{
				change = pay - tot;
			}

            return change;
	}


	public String toString()
	{
		return (""+payment());
	}
}