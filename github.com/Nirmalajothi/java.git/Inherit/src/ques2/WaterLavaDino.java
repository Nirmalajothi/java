package ques2;

public class WaterLavaDino extends LavaDino{
    private int fins;
    private float tails;
    private float multi;
	private float locospeed;
	private int speed;
	public WaterLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfFins,
		float numberOfTails, float lavaMultiplier)
	{
		super(species,locomotionType,locomotionSpeed);
		this.locospeed=super.getLocomotiveSpeed();
		this.fins=numberOfFins;
		this.tails=numberOfTails;
		this.multi=lavaMultiplier;
	}
	void displayDinoSpeed ()
	{
		speed=((int)this.locospeed)+
                (this.fins+(int)this.tails)
                * (int)this.multi;
		System.out.print(speed+" km/h");
	}

}