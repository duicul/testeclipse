
public class MuzicaNuntaLocal extends Muzica implements MuzicaNunta {

	public MuzicaNuntaLocal(int price) {
		super(price);
	}

	@Override
	public String canta(Nunta n) {
		return n+" canta Rock Manele Blues pentru " + price +" lei";
	}

}
