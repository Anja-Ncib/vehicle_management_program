package project;

public class Test {

	public static void main(String[] args) {
		Roue[] tabRoue= {new Roue(60),new Roue(60)};
		
		Vehicule velo1=new Vehicule(tabRoue);
		Vehicule velo2=new Vehicule(tabRoue);
		System.out.println(velo1.toString());
		System.out.println(velo2.toString());
		System.out.println("number of vehicles created = "+Vehicule.nb);
		
		Vehicule copyVelo1=velo1.clone();
		System.out.println(copyVelo1.toString());
		
		Convoi c= new Convoi();
		
		c.ajoute(velo1);
		System.out.println(Convoi.numVeh);
		c.ajoute(velo2);
		
		System.out.println(c.toString());
		
		Roue r1=new Roue(60);
		Roue r2=new Roue(60);
		System.out.println(r1.compatible(r2));
	}

}
