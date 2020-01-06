package ques1;

public class Dinosaur {
    private String species;
    private String locomotion;
	public Dinosaur(String species, String locomotiontype) {
		this.species=species;
		this.locomotion=locomotiontype;
	}
	public String getSpecies() {
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
	public String toString()
	{
		return("Species : "+species+"\n"+"Travels by : "+locomotion);
	}

}