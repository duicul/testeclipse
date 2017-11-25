
public class Nunta extends Eveniment {

	public Nunta(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{return "Nunta ";}
	
	public String formatie(Muzica m)
	{String aux=""; 
	if(m instanceof Blues)
		aux+=((Blues) m).cantaBlues(this);
	if(m instanceof Rock)
		aux+="\n"+((Rock) m).cantaRock(this);
	if(m instanceof Manele)
		aux+="\n"+((Manele) m).cantaManele(this);
   return aux;
	}
}
