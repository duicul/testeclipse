
public class MuzicaLocal extends Muzica implements Blues, Rock, Manele {

	public MuzicaLocal(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cantaManele(Eveniment e) {
		return e+"canta Manele";
	}

	@Override
	public String cantaRock(Eveniment e) {
		return e+"canta Rock";
	}

	@Override
	public String cantaBlues(Eveniment e) {
		return e+"canta Blues";
	}

}
