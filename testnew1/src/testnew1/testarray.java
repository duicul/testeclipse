package testnew1;

import java.util.*;
import java.util.stream.Collectors;

public class testarray {
private int a[]= new int [10],nrel=0;
	public void addel(int el)
	{try{a[nrel]=0;
	System.out.println("stop"+el);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{int aux[]=new int[nrel*2];
	for(int i=0;i<nrel;i++)aux[i]=a[i];
	a=aux;		
	System.out.println("full"+el);}
	finally{a[nrel++]=el;}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<100;i++)
		a.add(i);
		System.out.println(a);
		List<Integer> b=a.stream().filter(x->x%2==0).collect(Collectors.toList());
		Set<Integer> c=a.stream().map(x->2*x).collect(Collectors.toSet());
		List<Integer> d=a.stream().filter(x->x%3==0).map(x->2*x).collect(Collectors.toList());
		int e=a.stream().filter(x->x<4&&x!=0).reduce(1,(acc,el)->acc*el);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		testarray t=new testarray();
		for(int i=0;i<30;i++)
		{t.addel(i); }

	}

}
