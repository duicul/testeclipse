
public abstract class Eveniment {
protected int len;
	public Eveniment(int len) {
		this.len=len;
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{return "";}
	
   public String formatie(Muzica m)
   {return m.canta(this);	   
   }
}
