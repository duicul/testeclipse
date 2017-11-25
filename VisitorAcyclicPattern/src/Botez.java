
public class Botez extends Eveniment {

	public Botez(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{return "Botez ";}
	
	public String formatie(Muzica m)
	{ String aux="";
		if(m instanceof Blues)
		aux+=((Blues) m).cantaBlues(this);
	if(m instanceof Manele)
		aux+="\n"+((Manele) m).cantaManele(this);
	return aux;}
}
