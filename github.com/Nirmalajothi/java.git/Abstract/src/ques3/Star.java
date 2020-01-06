package ques3;
abstract public class Star {
    private String name;
    private String constname;
    private int current;
    private int emit;
    private int consume;
	public Star(String starname, String constelname, int age, int energyemit,int energyconsume) {
		name=starname;
		constname=constelname;
		current=age;
		emit=energyemit;
		consume=energyconsume;
	}
	abstract int  calculateyears();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConstname() {
		return constname;
	}

	public void setConsname(String constname) {
		this.constname = constname;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getEmit() {
		return emit;
	}

	public void setEmit(int emit) {
		this.emit = emit;
	}

	public int getConsume() {
		return consume;
	}

	public void setConsume(int consume) {
		this.consume = consume;
	}

	private float result;
	public float calculateEmissionRate()
	{
		 result=(float)(emit-consume)/(float)(calculateyears()-current);  
		 return result;
	}
	public void display()
	{
		System.out.print("Star Details:"+name+"\n");
		System.out.print("Constellation:"+constname+"\n");
		System.out.print("Emission rate:"+result);
	}
            
}
