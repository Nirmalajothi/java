package ques3;

public class PlasmaStar extends Star{
    private int index,c;     
	public PlasmaStar(String starname, String constelname, int decayindex, int energyemit, int age,int energyconsume) {
		super(starname,constelname,age,energyemit,energyconsume);
		index=decayindex;
	}
	int  calculateyears()
	{
		int a=0,b=1;
		for(int i=1;i<=index-1;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		return c;
	}

}