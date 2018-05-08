package tartalyos;

public class Tartaly extends Tarolo {
	
	public Tartaly(int terfogat) {
		super(terfogat);
		
	}

	private double nyomas;

	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas=nyomas;
		
	}

	public boolean veszelyesE() {
		if((getTerfogat()*nyomas)>100){
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + ", terfogat=" + getTerfogat() + "]";
	}
	
	public boolean isBiggerThan(Tartaly tartaly){
		if(this.nyomas>tartaly.getNyomas()){
			return true;
		}
		else return false;
	}

	public double getNyomas() {
		return nyomas;
	}

	public void setNyomas(double nyomas) {
		this.nyomas = nyomas;
	}
	
	public static Tartaly getBiggerTartaly(Tartaly tartaly1, Tartaly tartaly2){
		if(tartaly1.getTerfogat()> tartaly2.getTerfogat()){
			return tartaly1;
		}
		else return tartaly2;
	}
	

}
