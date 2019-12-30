package List;

public class Matchlist {
public Matchlist(byte match,byte nfwins,byte nfloss,float alapspeed,float mlapspeed,float athrowdisteance,float mthrowdistance) {
super();
this.match = match;
this.nfwins = nfwins;
this.nfloss = nfloss;
this.alapspeed = alapspeed;
this.mlapspeed =mlapspeed;
this.athrowdisteance = athrowdisteance;
this.mthrowdistance = mthrowdistance;
}
private byte match,nfwins,nfloss;
private float alapspeed,mlapspeed,athrowdisteance,mthrowdistance;

public void display() {
System.out.println(match);
System.out.println(nfwins);
System.out.println(nfloss);
System.out.println(alapspeed);
System.out.println(mlapspeed);
System.out.println(athrowdisteance);
System.out.println(mthrowdistance);
}
}