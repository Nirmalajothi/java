package ques3;

public class RadiumStar extends Star{
	private int index,c;    
	public RadiumStar(String starname, String constelname, int decayindex, int energyemit, int age,int energyconsume) {
		super(starname,constelname,age,energyemit,energyconsume);
		index=decayindex;
	}
	int  calculateyears()
	{
		c=(index*(index+1))/2;
		return c;
	}
}