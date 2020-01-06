package ques1;

public class CubicalPlanet extends Planet{
    private float height;
    private float width;
    private float length;
    private float result;
	public CubicalPlanet(String Planetname, float height, float width, float length) {
		super(Planetname);
		this.height=height;
		this.width=width;
		this.length=length;	
	}
	public float getRadius() {
		return height;
	}
	public void setRadius(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	float calVol()
	{
		result=height*length*width;
		return result;
	}

}