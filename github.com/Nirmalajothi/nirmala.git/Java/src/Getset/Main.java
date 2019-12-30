package Getset;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String teamname=sc.next();
		String cityrep=sc.next();
		Set Set=new Set(teamname,cityrep);
		System.out.println(Set.getteamname());
		System.out.println(Set.getcity());

	}

}
