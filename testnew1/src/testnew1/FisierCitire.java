package testnew1;
import java.io.*;
public class FisierCitire {
	public static void main(String[] args) {
		String aux;
		int [] t;
		try{
		t=new int[100];
		int n=0,j;
		BufferedReader test = new BufferedReader(new FileReader("test.txt"));
		while((aux=test.readLine())!=null)
		{	
		t[n++]=Integer.parseInt(aux);
		}
		/*for(int i:t)
		System.out.println(t[i]);*/
		for(j=0;j<n;j++)
		System.out.println(t[j]);
		test.close();
		}
		catch(IOException e){
			System.out.println("Eroare la operatiile de intrare-iesire!");
			System.exit(1);
		}
	
		}

}
