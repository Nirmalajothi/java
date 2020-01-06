package ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String species;
		String locomotionType;
		float locomotionSpeed;
		int f;
		int numberOfFins;
		float numberOfTails;
		float lavaMultiplier;
		int numberOfWings;
		float speedPerWing;
		float ashResistance;
		Scanner s=new Scanner(System.in);
	    System.out.println("1. Land Dino\n2. Aqua Dino\n3. Aerial Dino");
	    System.out.println("\nEnter your Choice:");
	    int num=s.nextInt();
        if(num==1)
        {
        	System.out.println("Enter Species:");
        	species=s.next();
        	System.out.println("Enter type:");
        	locomotionType=s.next();
        	System.out.println("Enter Speed:");
        	locomotionSpeed=s.nextFloat();
        	System.out.println("Enter no. of feet:");
        	f=s.nextInt();
        	LandLavaDino ld=new LandLavaDino(species,locomotionType,locomotionSpeed,f);
        	ld.display();
        	ld.displayDinoSpeed();
        }
        else if(num==2)
        {
        	System.out.print("Enter Species:");
        	species=s.next();
        	System.out.print("Enter type:");
        	locomotionType=s.next();
        	System.out.print("Enter Speed:");
        	locomotionSpeed=s.nextFloat();
        	System.out.println("Enter no.of fins");
        	numberOfFins=s.nextInt();
        	System.out.println("Enter no.of tails");
        	numberOfTails=s.nextFloat();
        	System.out.println("Enter lavamultiplier");
        	lavaMultiplier=s.nextFloat();
        	WaterLavaDino wd=new WaterLavaDino(species,locomotionType,locomotionSpeed,
        			numberOfFins,numberOfTails,lavaMultiplier);
        	wd.display();
        	wd.displayDinoSpeed();   	     	
        }
        else if(num==3)
        {
        	System.out.print("Enter Species:");
        	species=s.next();
        	System.out.print("Enter type:");
        	locomotionType=s.next();
        	System.out.print("Enter Speed:");
        	locomotionSpeed=s.nextFloat();
        	System.out.print("Enter no. of wings: ");
        	numberOfWings=s.nextInt();
        	System.out.print("Enter speed/wing:");
        	 speedPerWing=s.nextFloat();
        	 System.out.print("Enter ash Resisitance");
    		ashResistance=s.nextFloat();
    		AirLavaDino ad=new AirLavaDino(species,locomotionType,locomotionSpeed,
    				numberOfWings,speedPerWing,ashResistance);
    		ad.display();
    		ad.displayDinoSpeed();
        }

	}

}