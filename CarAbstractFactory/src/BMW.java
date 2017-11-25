public class BMW extends Car {

	public BMW(int size,int r,int val) {
		CarPartFactory cpf= new BMWPartFactory();
		this.w=cpf.createwindow(size);
		this.h=cpf.createHue(val);
		this.sw=cpf.createSteeringWheel(r);
	}

}
