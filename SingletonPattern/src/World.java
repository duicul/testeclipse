
public class World {
  private int size;
  private static World w=null;
	private World(int size) {
		this.size=size;
		// TODO Auto-generated constructor stub
	}
  static public World createWorld(int size)
  {if(w==null)
	  w=new World(size);
  return w;
  }
  
  static public void eraseWorld()
  {w=null;}
  
  public String toString()
  { return "World size: "+size;}
}
