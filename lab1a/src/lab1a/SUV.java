package lab1a;

public class SUV extends Masina {
  private int garda;
  private boolean patru; 
  public SUV(String marca,String tip,String c,int l,int u,int v,Motor m,boolean patru,int garda)
  {super(marca,tip,c,l,u,v,m);
  this.patru=patru;
  this.garda=garda;}
}
