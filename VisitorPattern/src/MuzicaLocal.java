
public class MuzicaLocal implements Muzica {
protected int price;
	public MuzicaLocal(int price) {
		this.price=price;
	}
  public String canta(Nunta n)
  {return n+"canta Blues si Rock pentru "+price+" lei ";}
  
  public String canta(Botez b)
  {return b+"canta Blues pentru "+price+" lei ";}

}
