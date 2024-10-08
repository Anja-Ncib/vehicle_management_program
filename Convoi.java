package project;

import java.util.Arrays;

public class Convoi {
	public final int TAILLEMAX=4;
	private static Vehicule[] tabVeh;
	public static int numVeh;
	private static Convoi convoiInstance=null;
	
	public Convoi() {
		tabVeh=new Vehicule[4];
		numVeh=0;
	}
	
	public static  Convoi getInstance() {
		if (convoiInstance==null) convoiInstance=new Convoi();
		return convoiInstance;
	}
	
	public static int ajoute(Vehicule v) {
		int i=0;
		while (i<4) {
			if (tabVeh[i]!=null)
			{	tabVeh[i]=v;
				numVeh++;
			break;
			}
			else i++;
		}
		if (i>=4) return -1;
		else return i;
	}

	
	public String toString() {
		return "Convoi : " + Arrays.toString(tabVeh) ;
	}
}
