package List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

public static void main(String[] args) throws IOException{
   InputStreamReader a=new InputStreamReader(System.in);
   BufferedReader b=new BufferedReader(a);
   byte match=Byte.parseByte(b.readLine());
   byte nfwins=Byte.parseByte(b.readLine());
   byte nfloss=Byte.parseByte(b.readLine());
   float alapspeed=Float.parseFloat(b.readLine());
   float mlapspeed=Float.parseFloat(b.readLine());
   float athrowdisteance=Float.parseFloat(b.readLine());
   float mthrowdistance=Float.parseFloat(b.readLine());
   Matchlist pl=new Matchlist(match,nfwins,nfloss,alapspeed,mlapspeed,athrowdisteance,mthrowdistance);
   pl.display();
}

}
