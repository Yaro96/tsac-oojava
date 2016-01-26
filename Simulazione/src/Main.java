
import java.util.Scanner;

public class Main {

	static int scan()
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		return n;
	}

	static void cls()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public static void main(String[] args) {

		/*Simulazione simulation=new Simulazione();
		Preda preda=new Preda(1,1);
		Predatore predatore=new Predatore(1, 2);
		simulation.addCella(new Cella(preda));
		simulation.addCella(new Cella(predatore));
		simulation.stampa();
		simulation.passo();*/
		
		Simulazione simulation=new Simulazione();
		int scelta;
		int numeroPrede=0;
		int numeroPredatori=0;
		int x;
		int y;
		int passi=0;
		
		do
		{
			System.out.println("\n\n1.Inserire il numero di prede");
			System.out.println("2.Inserire il numero di predatori");
			System.out.println("3.Avviare la simulazione");
			System.out.println("0.Fine");

			do
			{
				System.out.print("\nScelta: ");
				scelta=scan();
			}while(scelta<0 || scelta>4);

			switch(scelta)
			{
				case 1:	do{
							System.out.print("\nNumero di prede: ");
							numeroPrede=scan();
						}while(numeroPrede<0 || numeroPrede+numeroPredatori>400);
						break;
				case 2:	do{
							System.out.print("\nNumero di predatori: ");
								numeroPredatori=scan();
						}while(numeroPredatori<0 || numeroPrede+numeroPredatori>400);
						break;
				case 3:	for(int i=0;i<numeroPrede;i++){
							x=(int) (Math.random() * 20);
							y=(int) (Math.random() * 20);
							if(simulation.mondo[x][y].contenuto=='+'){
								Preda preda=new Preda(x,y);
								simulation.addCella(new Cella(preda));
							}else
								i--;
						}
						for(int i=0;i<numeroPredatori;i++){
							x=(int) (Math.random() * 20);
							y=(int) (Math.random() * 20);
							if(simulation.mondo[x][y].contenuto=='+'){
								Predatore predatore=new Predatore(x,y);
								simulation.addCella(new Cella(predatore));
							}else
								i--;
						}
						cls();
						simulation.stampa();
						do
						{
							System.out.println("\n\n1.Esegui un passo");
							System.out.println("0.Fine");
							System.out.print("\nScelta: ");
							scelta=scan();
							
							if(scelta==1){
								cls();
								simulation.passo();
								passi++;
							}
						}while(scelta!=0);
						break;
			}
		}while(scelta!=0);
		System.out.println("La simulazione e' terminata con "+passi+" passi");
	}

}
