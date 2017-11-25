
public class Main {
private static World w;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		w=World.createWorld(25);
        System.out.println(w);
        w=World.createWorld(12);
        System.out.println(w);
	}

}
