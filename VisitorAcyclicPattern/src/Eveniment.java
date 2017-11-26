
public abstract class Eveniment {
protected int len;
	public Eveniment(int len) {
		this.len=len;
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{return "durata : "+len;}
	
	public abstract String formatie(Muzica m);
}
