package ques1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String species;
	
		String locomotiontype;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Species : ");
		species=s.next();
		System.out.println("Enter type : ");
		locomotiontype=s.next();
		System.out.println("Is it heat resistant?");
		boolean heatResist;
		heatResist=s.nextBoolean();
		LavaDino ld=new LavaDino(species,locomotiontype,heatResist);
        ld.display();
	}

}
