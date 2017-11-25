package factory;

public class Main {
	public static void main(String[] args) {
		TableFactory tf[]=new TableFactory[4];
		Table t[]=new Table[4];
        tf[0]=new OtherTableFactory();
        t[0]=tf[0].createTable(12,"red","wood");
        tf[1]=new WenkyTableFactory();
        t[1]=tf[1].createTable(10,"blue","wood");
        tf[2]=new OtherTableFactory();
        t[2]=tf[2].createTable(12,"red","stone");
        tf[3]=new WenkyTableFactory();
        t[3]=tf[3].createTable(16,"yellow","metal");
        for(Table tv:t)
        {System.out.println(tv);}
	}

}
