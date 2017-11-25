package lab1a;

public abstract class Masina {
	protected String marca,tip,culoare;
	protected int loc,usi,viteza;
	protected Motor m;
	public Masina(String marca,String tip,String c,int loc,int usi,int v,Motor m)
	{this.marca=marca;
	 this.tip=tip;
	 this.culoare=c;
	 this.loc=loc;
	 this.usi=usi;
	 this.viteza=v;
	 this.m=m;
	}

}
