package ques2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		Scanner s=new Scanner(System.in);
        System.out.print("1.Star Door\r\n" + "\r\n" + "2.Gas Door\r\n" + "\r\n" + "3.Liquid Door"+"\n");
        int choice;
        String gas;
        System.out.println("\nEnter Choice:");
        choice=s.nextInt();
        System.out.println("Enter Name:");
        name=s.next();
        int star;
        int prime;
        if(choice==1)
        {
        	System.out.println("Enter Stars:");
        	star=s.nextInt();
        	StarDoor sd=new StarDoor(name,star);
        	sd.unlock();
        }
        else if(choice==2)
        {
        	System.out.println("Enter Gas:");
        	gas=s.next();
        	GasDoor gd=new GasDoor(name,gas);
        	gd.unlock();
        }
        else if(choice==3)
        {
        	System.out.println("Enter Flow:");
        	prime=s.nextInt();
        	LiquidDoor ld=new LiquidDoor(name,prime);
        	ld.unlock();
        }
	}

}