
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Eveniment e[]=new Eveniment[2];
        e[0]=new Botez(12);
        e[1]=new Nunta(13);
        for(int i=0;i<e.length;i++)
        {System.out.println(e[i].formatie(new MuzicaLocal(123)));
        }
	}

}
