package factory;

public class OtherTableFactory extends TableFactory {

	public Table createTable(int legs, String color, String texture) {
		return new OtherTable(legs,color,texture);}

}
