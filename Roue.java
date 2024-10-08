package project;

public class Roue {
	final float DIAMETREMIN=50;
	final float DIAMETREMAX=100;
	float d;
	public Roue(float d) {
		if (d<DIAMETREMIN)
		{
			this.d=DIAMETREMIN;
		}
		else if (d>DIAMETREMAX)
		{
			this.d=DIAMETREMAX;
		}
		else
		{
			this.d=d;
		}
		
	}
	public float getDiametre() {
		return d;
	}
	public Boolean compatible(Object obj) {
		if (this==obj)return true;
		if (obj==null) return false;
		if (getClass()!=obj.getClass())return false;
		Roue other=(Roue)obj;
		return d==other.d;
		}
	

}
