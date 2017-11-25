package factory;

public class OtherTable extends Table {
	public OtherTable(int legs, String color, String texture) {
		this.legs=legs;
		this.color=color;
		this.texture=texture;
	}
	public String toString()
	{return "OtherTable "+legs+" "+color+" "+texture;}

}
