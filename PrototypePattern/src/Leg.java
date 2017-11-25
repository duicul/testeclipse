
public class Leg {
protected int h;
	public Leg(int h) {
		this.h=h;
		// TODO Auto-generated constructor stub
	}
  public Leg copy()
  {return new Leg(this.h);}
  public String toString()
  {return "Leg "+h;}
}
