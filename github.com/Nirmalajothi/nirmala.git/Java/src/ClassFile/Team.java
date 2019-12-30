package ClassFile;

public class Team {

private String tem;
private String cty;

public Team(String teamname,String cityrepresented) {
super();
this.tem = teamname;
this.cty = cityrepresented;
}

public void display()
{
System.out.print(tem);
System.out.println(cty);
}

}