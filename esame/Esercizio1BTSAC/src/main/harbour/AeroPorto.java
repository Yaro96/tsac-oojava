package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class AeroPorto {
	
	private double dimensioneSqMeters;
	private double metriQuadriDistrutti=0;

	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}

	public void setDimensioneSqMeters(double dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
	}

	public void addMetriQuadriDistrutti(double danno){
		metriQuadriDistrutti+=danno;
	}
	
	public double getDimensioneSqMetersNonDistrutta(){
		if(dimensioneSqMeters-metriQuadriDistrutti<0)
			return 0;
		else
			return dimensioneSqMeters-metriQuadriDistrutti;
	}
	
	
}
