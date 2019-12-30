package ClassFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) throws IOException {
	
	
		InputStreamReader s=new InputStreamReader(System.in);
		BufferedReader a=new BufferedReader(s);
		String teamname=a.readLine();
		String cityrepresented=a.readLine();
		Team te=new Team(teamname,cityrepresented);
		te.display();
	}

}
