package factory;

public class WenkyTable extends Table {

	public WenkyTable(int legs, String color, String texture) {
		this.legs=legs;
		this.color=color;
		this.texture=texture;
	}
	public String toString()
	{return "WenkyTable "+legs+" "+color+" "+texture;}

}
