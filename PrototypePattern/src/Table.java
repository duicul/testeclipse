
public class Table {
protected Leg[] legs=new Leg[4];
protected Board b;
	public Table(int h1,int h2,int h3,int h4,int g) {
		legs[0]=new Leg(h1);
		legs[1]=new Leg(h2);
		legs[2]=new Leg(h3);
		legs[3]=new Leg(h4);
		b=new Board(g);
	}
   public Table(Leg[] legs,Board b)
   {this.legs=legs;
   this.b=b;}
   public Table copy()
   {Leg[] auxlegs=new Leg[4];
   for(int i=0;i<legs.length;i++)
	   auxlegs[i]=legs[i].copy();
    
	   return new Table(auxlegs,b.copy());}
   
   
   public String toString()
   { return legs[0]+"\n"+legs[1]+"\n"+legs[2]+"\n"+legs[3]+"\n"+b;
	   
	   
   }
}
