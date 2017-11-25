
public class Main {

	public Main() {
	 
	}

	public static void main(String[] args) {
		Table a,b;
		a=new Table(10,12,13,14,15);
		System.out.println(a);
		b=a.copy();
        System.out.println(b);
	}

}
