package ClassObjects;

public class Records {

private String namepl;
private String postionpl;

public Records(String playername, String playerpostion){
super();
this.namepl = playername;
this.postionpl = playerpostion;
}
 
public void display()
{
System.out.println(namepl);
System.out.println(postionpl);
}
}