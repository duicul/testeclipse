
public class Board {
protected int g;
	public Board(int g) {
		this.g=g;
		// TODO Auto-generated constructor stub
	}
 public Board copy()
 {return new Board(this.g);}
 
 public String toString()
 {return "Board "+g;}
}
