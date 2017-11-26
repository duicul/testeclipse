
public class Nunta extends Eveniment {

	public Nunta(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{return "Nunta "+super.toString()+" ";}
	
	public String formatie(Muzica m)
	{if(m instanceof MuzicaNunta)
		return ((MuzicaNunta) m).canta(this);
    return  "";
	}
}
