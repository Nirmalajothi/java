package ClassObjects;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {

public static void main(String[] args)throws IOException  {
InputStreamReader s=new InputStreamReader(System.in);
BufferedReader a=new BufferedReader(s);
String playername=a.readLine();
String playerpostion=a.readLine();
Records pl=new Records(playername,playerpostion);
pl.display();



}

}
