package project;

public class Vehicule {
	Roue[] wheels=new Roue[100];
	static int nb=0;
	public Vehicule(Roue[] wheels) {
		this.wheels=wheels;
		nb++;
	}
	public static int nbVehicle() {
		return nb;
	}
	public int nbWheels() {
		int i=0;
		while(i<wheels.length)
		{
			if (wheels[i]!=null) i++;
			else break;
		}
		return i;
	}
	public String toString() {
		if (nbWheels()==2) {
			return "bicycle with wheels of "+(wheels[0].getDiametre())+"cm";
		}
		else if (nbWheels()==3)
			return "tricycle with wheels of "+(wheels[0].getDiametre())+"cm";
		else if (nbWheels()==4)
			return "car with wheels of "+(wheels[0].getDiametre())+"cm";
		else
			return "vehicle with "+(nbWheels())+" wheels of "+(wheels[0].getDiametre())+"cm"; 
	}
	public Vehicule clone() {
		Roue[] tabClone=new Roue[nbWheels()];
		tabClone=wheels;
		return new Vehicule(tabClone);
	}

}
