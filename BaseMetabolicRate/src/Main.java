
public class Main {

	public static void main(String[] args) {
		
		Persona alice=new Persona(165, 55, 20, "attivo", 'f');
		System.out.println(Salute.MetabolicRate(alice));
		System.out.println(Salute.IMC(alice));
		
		Persona bob=new Persona(175, 60, 19, "attivo", 'm');
		System.out.println(Salute.MetabolicRate(bob));
		System.out.println(Salute.IMC(bob));
	}

}
