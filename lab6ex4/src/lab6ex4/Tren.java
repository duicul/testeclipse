package lab6ex4;

public class Tren {
private Vagon[]v=new Vagon[15];
private int nr_vagon;
public Tren(Vagon []v,int nr_vagon) {
		this.v=v;
		this.nr_vagon=nr_vagon;
		// TODO Auto-generated constructor stub
	}
public boolean equals(Object o)
{int s1=0,s2=0;
if(o instanceof Tren)
{for(int i=0;i<this.nr_vagon;i++)
 s1+=this.v[i].colete;
 for(int i=0;i<((Tren)o).nr_vagon;i++)
 s2+=((Tren)o).v[i].colete;
if(s1==s2)return true;
else return false;
}
else return false;	}
public String toString()
{String s="";
for(int i=0;i<this.nr_vagon;i++)
{if(v[i] instanceof Marfa) s+=" Marfa ";
else if(v[i] instanceof CalatoriA) s+=" CalatoriA ";
else if(v[i] instanceof CalatoriB) s+=" CalatoriB ";
}
return s;
}
public static void main(String[] args)
{Tren t1,t2;
Vagon[] q=new Vagon[15];
q[0]=new Marfa();
q[1]=new CalatoriA();
q[2]=new CalatoriB();
t1=new Tren(q,3);
q[3]=new Marfa();
t2=new Tren(q,4);
System.out.println(t1.equals(t2)+" "+t1.equals(t1));
System.out.println(t1);
System.out.println(t2);
}}