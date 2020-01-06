package ques2;

public class LavaDino {
	   private String species;
	   private String locomotion;
	   private float locomotiveSpeed;
	  
	   public LavaDino(String species,String locomote,float loco)
	   {
		   this.species=species;
		   this.locomotion=locomote;
		   this.locomotiveSpeed=loco;	   
	   }
	   public String getSpecies() 
	   {
		return species;
	   }
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getLocomotion() {
		return locomotion;
	}
	public void setLocomotion(String locomotion) {
		this.locomotion = locomotion;
	}
	public float getLocomotiveSpeed() {
		return locomotiveSpeed;
	}
	public void setLocomotiveSpeed(float locomotiveSpeed) {
		this.locomotiveSpeed = locomotiveSpeed;
	}
	public void display()
	{
		System.out.println("\nDino Details");
		System.out.println("Species : "+species);
		
		System.out.println("Travels by "+locomotion+" at a Speed of ");
	}
	}
