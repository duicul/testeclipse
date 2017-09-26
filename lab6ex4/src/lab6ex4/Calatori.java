package lab6ex4;

abstract class Calatori extends Vagon {
protected int pasageri;
	public Calatori(int colete,int pasageri) {
		super(colete);
		this.pasageri=pasageri;
		// TODO Auto-generated constructor stub
	}
	public void descUsa()
	{System.out.println("Usa deschisa");}
	public void incUsa()
	{System.out.println("Usa inchisa");}
}
