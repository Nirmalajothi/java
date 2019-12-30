package Getset;

public class Set {
	
	public Set(String teamname, String cityrep) {
	super();
	this.teamname = teamname;
	this.cityrep = cityrep;
	}
	private String teamname;
	private String cityrep;


	public String getteamname() {
	return teamname;
	}

	public void setteamname(String teamname) {
	this.teamname=teamname;
	}

	public String getcity() {
	return cityrep;
	}
	public void setcity(String city) {
	this.cityrep=cityrep;
	}
	}

