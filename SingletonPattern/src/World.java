
public class World {
  private int size;
  static World w=null;
	private World(int size) {
		this.size=size;
		// TODO Auto-generated constructor stub
	}
  static public World createWorld(int size)
  {if(w==null)
	  w=new World(size);
  return w;
  }
  
  public String toString()
  { return "World size: "+size;}
}
