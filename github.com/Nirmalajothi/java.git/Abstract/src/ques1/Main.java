package ques1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String Planetname;
		Scanner s=new Scanner(System.in);
        
        int type;   
        float radius;
        float width;
        float length;
        float height;
        float side;
        System.out.print("1.Cuboidal Planet\r\n" + "\r\n" + "2.Spherical Planet\r\n" + "\r\n" + "3.Cubical Planet\r\n" + "\r\n" + "4.Conical Planet"+"\n");
        System.out.println("\nEnter your choice:");
        type=s.nextInt();
        System.out.println("Enter Name");
        Planetname=s.next();
        if(type==1)
        {   System.out.println("Enter Height");
        	height=s.nextFloat();
        	System.out.println("Enter Width");
        	width=s.nextFloat();
        	System.out.println("Enter Length");
        	length=s.nextFloat();
        	CuboidalPlanet cuboid=new CuboidalPlanet(Planetname,height,width,length);
        	System.out.println("Volume:"+cuboid.calVol()+"Km3");
        }
        else if(type==2)
        {
        	System.out.println("Enter Radius");
        	radius=s.nextFloat();
        	SphericalPlanet sphere=new SphericalPlanet(Planetname,radius);
        	System.out.println("Volume:"+sphere.calVol()+"Km3");
        }
        else if(type==3)
        {
        	System.out.println("Enter Side");
        	side=s.nextFloat();
        	CubicalPlanet cube=new CubicalPlanet(Planetname,side, side, side);
        	System.out.print("Volume:"+cube.calVol()+"Km3");
        }
        else if(type==4)
        {
        	System.out.println("Enter Height");
        	height=s.nextFloat();
        	System.out.println("Enter Radius");
        	radius=s.nextFloat();
        	ConicalPlanet cone=new ConicalPlanet(Planetname,height,radius);
        	System.out.println("Volume:"+cone.calVol()+"Km3");
        }
	}

}