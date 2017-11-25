package factory;

public class WenkyTableFactory extends TableFactory {
	public Table createTable(int legs, String color, String texture) {
		return new WenkyTable(legs,color,texture);}
}
