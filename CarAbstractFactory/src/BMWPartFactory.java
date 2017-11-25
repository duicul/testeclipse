
public class BMWPartFactory extends CarPartFactory {

	public BMWPartFactory() {
		// TODO Auto-generated constructor stub
	}

	public Window createwindow(int size) {
		// TODO Auto-generated method stub
		return new TintedWindow(size);
	}

	@Override
	public SteeringWheel createSteeringWheel(int r) {
		// TODO Auto-generated method stub
		return new BigSteeringWheel(r);
	}

	@Override
	public Hue createHue(int val) {
		// TODO Auto-generated method stub
		return new BlueHue(val);
	}

}
