package ques3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
	String starname;
	String constelname;
	int decayindex;
	int energyemit;
	int age;
	int energyconsume;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Star Details\n");
	System.out.println("Enter Star name:");
	starname=s.next();
	System.out.println("Enter constellationName:");
	constelname=s.next();
	System.out.println("Enter decayIndex:");
	decayindex=s.nextInt();
	System.out.println("Enter energyToEmit:");
	energyemit=s.nextInt();
	System.out.println("Calculate Emission Rate");
	System.out.println("Enter age:");
	age=s.nextInt();
	System.out.println("Enter energyconsume:");
	energyconsume=s.nextInt();
	int a;
	System.out.print("1.Plasma Star\r" + "\r" + "2.Radium Star\r" + "\r" + "3.Dark Star"+"\n");
	a=s.nextInt();
	if(a==1)
	{
		PlasmaStar plasma=new PlasmaStar(starname,constelname,decayindex,energyemit,age,energyconsume);
		plasma.calculateEmissionRate();
		plasma.display();
	}
	else if(a==2)
	{
		RadiumStar rs=new RadiumStar(starname,constelname,decayindex,energyemit,age,energyconsume);
		rs.calculateEmissionRate();
		rs.display();
	}
	else if(a==3)
	{
		DarkStar ds=new DarkStar(starname,constelname,decayindex,energyemit,age,energyconsume);
		ds.calculateEmissionRate();
		ds.display();
	}
}
}