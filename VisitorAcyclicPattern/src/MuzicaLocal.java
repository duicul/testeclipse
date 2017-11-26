
public class MuzicaLocal extends Muzica implements MuzicaBotez,MuzicaNunta{

	public MuzicaLocal(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String canta(Nunta n) {
		return n+" canta Rock Manele Blues pentru " + price +" lei";
	}

	@Override
	public String canta(Botez b) {
		return b+" canta Blues Rock pentru "+price+" lei";
	}


}
