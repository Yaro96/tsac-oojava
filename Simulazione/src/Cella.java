
public class Cella {

	char contenuto;
	Animal animale;
	
	Cella(){
		contenuto='+';
	}
	
	Cella(Predatore predator){
		contenuto='X';
		animale=predator;
	}
	
	Cella(Preda prey){
		contenuto='O';
		animale=prey;
	}
}
