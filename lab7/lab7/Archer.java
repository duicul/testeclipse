package lab7;

public class Archer extends Gaming{
	public Archer(int hp)
	{this.hp=hp;}
		public void kill()
	{System.out.println("horseman died");
	}
	public void heal()
	{this.hp+=5;}
	public void injure()
	{this.hp-=5;}
	public void getHp()
	{System.out.println(this.hp);}
}
