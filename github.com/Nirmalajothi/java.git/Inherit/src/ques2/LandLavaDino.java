package ques2;

public class LandLavaDino extends LavaDino {
    private int f;
    private float locospeed;
    private int speed;
	public LandLavaDino(String species, String locomotionType, float locomotionSpeed,int feet) {
		super(species,locomotionType,locomotionSpeed);
		this.f=feet;
		this.locospeed=super.getLocomotiveSpeed();
	}
	void displayDinoSpeed ()
	{
		speed=f*((int)this.locospeed);
		System.out.print(speed+" km/h");
	}

}