// This is Wahid Syed's code
public class orderObject extends Object
{
    private double qJames;
    private double pNadine;

// orderObject data initialization
    public orderObject()
    {
        qJames=0;
        pNadine=0;
    }

// orderObject data assignment
    public orderObject(double qJames,double pNadine)
    {

    	this.qJames=qJames;
		this.pNadine=pNadine;
    }

    public double order()
    {
    	return (qJames*pNadine);
    }
    public String toString()
    {
    	return ""+order();
    }
}