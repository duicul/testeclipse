
public class Botez extends Eveniment {

	public Botez(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{return "Botez "+super.toString()+" ";}
	
	public String formatie(Muzica m)
	{if(m instanceof MuzicaBotez)
		return ((MuzicaBotez)m).canta(this);
	return "";
	}
}
