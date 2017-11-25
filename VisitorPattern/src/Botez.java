
public class Botez extends Eveniment {

	public Botez(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{return "Botez ";}
	
	public String canta(Muzica m)
	{return m.canta(this); 
	}
}
