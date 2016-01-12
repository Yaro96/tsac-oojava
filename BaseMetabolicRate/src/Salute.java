
public class Salute {
	
	static double MetabolicRate(Persona p){
		double mb=655+1.8*p.altezza-4.7*p.eta;
		if(p.sesso=='m')
			mb+=13.8*p.peso;
		else if(p.sesso=='f')
			mb+=9.6*p.peso;
		
		double dieciPercento=mb/10;
		if(p.attivita=="sedentario")
			mb+=2*dieciPercento;
		else if(p.attivita=="moderatamente attivo")
			mb+=3*dieciPercento;
		else if(p.attivita=="attivo")
			mb+=4*dieciPercento;
		else if(p.attivita=="molto attivo")
			mb+=5*dieciPercento;
			
		return mb;
	}
	
	static String IMC(Persona p){
		double imc=p.peso/(double)((p.altezza*p.altezza)/10000);
		String s;
		if(imc<18.5)
			s=imc+" sottopeso";
		else if(imc<25)
			s=imc+" normale";
		else if(imc<30)
			s=imc+" sovrappeso";
		else
			s=imc+" obeso";
		
		return s;
	}
}
