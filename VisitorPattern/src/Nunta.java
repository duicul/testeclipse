
public class Nunta extends Eveniment {

	public Nunta(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{return "Nunta ";}
	
	public String formatie(Muzica m)
	{return  m.canta(this);
	}

}
