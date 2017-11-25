
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Eveniment e[]=new Eveniment[2];
        e[0]=new Botez(12);
        e[1]=new Nunta(13);
        System.out.println(e[0].formatie(new Rock(123)));
        System.out.println(e[0].formatie(new Blues(100)));
        System.out.println(e[1].formatie(new Rock(63)));
        System.out.println(e[1].formatie(new Blues(70)));
        
	}

}
