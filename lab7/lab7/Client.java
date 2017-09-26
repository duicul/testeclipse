package lab7;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Gaming h1,h2,a1,a2;
     h1=new Horserider(100);
     h2=new Horserider(200);
     a1=new Archer(130);
     a2=new Archer(140);
     h1.getHp();
     h1.injure();
     h1.getHp();
     h2.getHp();
     h2.heal();
     h2.getHp();
     a1.getHp();
     a1.injure();
     a1.getHp();
     a2.getHp();
     a2.heal();
     a2.getHp();
     
	}

}
