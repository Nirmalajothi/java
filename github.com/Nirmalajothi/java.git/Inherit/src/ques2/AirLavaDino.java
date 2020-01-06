package ques2;

public class AirLavaDino extends LavaDino {
	private float locospeed;
	private int wings;
	private float spw;
	private float asr;
	private int speed;
	public AirLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfWings,
		float speedPerWing, float ashResistance) 
	{
		super(species,locomotionType,locomotionSpeed);
		this.locospeed=super.getLocomotiveSpeed();
		this.wings=numberOfWings;
		this.spw=speedPerWing;
		this.asr=ashResistance;
	}
   void displayDinoSpeed  ()
   {
	   speed=(int)this.locospeed +
               (this.wings*(int)this.spw)-(int)this.asr;
	   System.out.print(speed+" m/h");
   }
	
}
