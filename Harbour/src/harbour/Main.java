package harbour;

public class Main {

	public static void main(String[] args) {

		Porto p=new Porto();
		p.setMetriQuadri(150);
		
		Sottomarino s=new Sottomarino();
		s.setNumeroArmamenti(2);
		s.setStazza(10);
		s.setIndiceP();
		
		Aereo a=new Aereo();
		a.setNumeroArmamentiAlpha(3);
		a.setNumetoArmamentiBeta(2);
		a.setIndiceP();
		
		Gioco g=new Gioco();
		g.setPorto(p);
		g.setInvasori(new Invasore[]{a,s});
		
		System.out.println(p.getMetriQuadri());
		g.attacco();
		System.out.println(p.getMetriQuadri());
		
		
		

	}

}
