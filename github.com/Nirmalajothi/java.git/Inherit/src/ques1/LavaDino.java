package ques1;

public class LavaDino extends Dinosaur {
    boolean dinotype;
	public LavaDino(String species, String locomotiontype, boolean heatResist) {
		super(species,locomotiontype);
		this.dinotype=heatResist;
	}
    void display()
    {
      if(dinotype==true)	
      {
    	  System.out.print(super.toString()+"\n"+"Lives in underground");
      }
      else
      {
    	  System.out.print(super.toString()+"\n"+"Did not survive");
      }
    }
	
	
	
}
