
public class Simulazione {

	Cella[][] mondo;
	
	Simulazione(){
		int i=0;
		int j=0;
		mondo=new Cella[20][20];
		while(i<20)
		{
			while(j<20)
			{
				mondo[i][j]=new Cella();
				j++;
			}
			i++;
			j=0;
		}
	}
	
	void stampa()
	{
		int i=0;
		int j=0;
		System.out.println("\n");
		while(i<mondo.length)
		{
			System.out.print(" ");
			while(j<mondo[0].length)
			{
				if(mondo[i][j].contenuto!='+')
					mondo[i][j].animale.spostato=false;
				System.out.print(mondo[i][j].contenuto+" ");
				j++;
			}
			System.out.println();
			i++;
			j=0;
		}
	}
	
	void addCella(Cella ceil){
		mondo[ceil.animale.x][ceil.animale.y]=ceil;
	}
	
	void passo(){
		int i=0;
		int j=0;
		while(i<mondo.length)
		{
			while(j<mondo[0].length)
			{
				if(mondo[i][j].contenuto=='X' && !mondo[i][j].animale.spostato)
					mondo[i][j].animale.spostamento(this);
				j++;
			}
			i++;
			j=0;
		}
		i=0;
		j=0;
		while(i<mondo.length)
		{
			while(j<mondo[0].length)
			{
				if(mondo[i][j].contenuto=='O' && !mondo[i][j].animale.spostato)
					mondo[i][j].animale.spostamento(this);
				j++;
			}
			i++;
			j=0;
		}
		this.stampa();
	}

}
