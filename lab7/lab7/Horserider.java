package lab7;

public class Horserider extends Gaming {
public Horserider(int hp)
{this.hp=hp;}
	public void kill()
{System.out.println("horseman died");
}
public void heal()
{this.hp+=10;}
public void injure()
{this.hp-=10;}
public void getHp()
{System.out.println(this.hp);}
}
