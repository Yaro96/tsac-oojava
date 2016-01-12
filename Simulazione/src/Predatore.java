
public class Predatore extends Animal{
	
	boolean mangiato=false;

	Predatore(int x, int y){
		this.x=x;
		this.y=y;
		eta=0;
		spostato=false;
		mangiato=false;
	}
	
	Predatore(int x, int y, boolean nato){
		this.x=x;
		this.y=y;
		eta=0;
		spostato=nato;
		mangiato=false;
	}
	
	void spostamento(Simulazione simulation){
		int direzione;
		if(x-1>=0 && simulation.mondo[x-1][y].contenuto=='O'){
			simulation.mondo[x--][y]=new Cella();
			simulation.mondo[x][y]=new Cella(this);
			mangiato=true;
		}else if(y-1>=0 && simulation.mondo[x][y-1].contenuto=='O'){
			simulation.mondo[x][y--]=new Cella();
			simulation.mondo[x][y]=new Cella(this);
			mangiato=true;
		}else if(x+1<20 && simulation.mondo[x+1][y].contenuto=='O'){
			simulation.mondo[x++][y]=new Cella();
			simulation.mondo[x][y]=new Cella(this);
			mangiato=true;
		}else if(y+1<20 && simulation.mondo[x][y+1].contenuto=='O'){
			simulation.mondo[x][y++]=new Cella();
			simulation.mondo[x][y]=new Cella(this);
			mangiato=true;
		}else{
			direzione = (int) (Math.random() * 4);
			switch(direzione){
				case 0:	if(x-1>=0 && simulation.mondo[x-1][y].contenuto=='+'){
				/*su*/		simulation.mondo[x--][y]=new Cella();
							simulation.mondo[x][y]=new Cella(this);
						}
						break;
				case 1:	if(y-1>=0 && simulation.mondo[x][y-1].contenuto=='+'){
				/*sinistra*/simulation.mondo[x][y--]=new Cella();
							simulation.mondo[x][y]=new Cella(this);
						}
						break;
				case 2:	if(x+1<20 && simulation.mondo[x+1][y].contenuto=='+'){
				/*giu*/		simulation.mondo[x++][y]=new Cella();
							simulation.mondo[x][y]=new Cella(this);
						}
						break;
				case 3:	if(y+1<20 && simulation.mondo[x][y+1].contenuto=='+'){
				/*destra*/	simulation.mondo[x][y++]=new Cella();
							simulation.mondo[x][y]=new Cella(this);
						}
						break;
			}
		}
		eta++;
		spostato=true;
		if(eta==8 && mangiato){
			eta=0;
			mangiato=false;
			this.generazione(simulation);
		}else if(eta==8 && !mangiato){//superfluous !mangiato
			simulation.mondo[x][y]=new Cella();
		}
	}
	
	void generazione(Simulazione simulation){
		int direzione = (int) (Math.random() * 4);
		Predatore figlio;
		switch(direzione){
			case 0:	if(x-1>=0 && simulation.mondo[x-1][y].contenuto=='+'){
			/*su*/		figlio=new Predatore(x-1, y, true);
						simulation.addCella(new Cella(figlio));
					}else if(y-1>=0 && simulation.mondo[x][y-1].contenuto=='+'){
			/*sinistra*/figlio=new Predatore(x, y-1, true);
						simulation.addCella(new Cella(figlio));
					}else if(x+1<20 && simulation.mondo[x+1][y].contenuto=='+'){
			/*giu*/		figlio=new Predatore(x+1, y, true);
						simulation.addCella(new Cella(figlio));
					}else if(y+1<20 && simulation.mondo[x][y+1].contenuto=='+'){
			/*destra*/	figlio=new Predatore(x, y+1, true);
						simulation.addCella(new Cella(figlio));
					}
					break;
			case 1:	if(y-1>=0 && simulation.mondo[x][y-1].contenuto=='+'){
			/*sinistra*/figlio=new Predatore(x, y-1, true);
						simulation.addCella(new Cella(figlio));
					}else if(x-1>=0 && simulation.mondo[x-1][y].contenuto=='+'){
			/*su*/		figlio=new Predatore(x-1, y, true);
						simulation.addCella(new Cella(figlio));
					}else if(x+1<20 && simulation.mondo[x+1][y].contenuto=='+'){
			/*giu*/		figlio=new Predatore(x+1, y, true);
						simulation.addCella(new Cella(figlio));
					}else if(y+1<20 && simulation.mondo[x][y+1].contenuto=='+'){
			/*destra*/	figlio=new Predatore(x, y+1, true);
						simulation.addCella(new Cella(figlio));
					}
					break;
			case 2:	if(x+1<20 && simulation.mondo[x+1][y].contenuto=='+'){
			/*giu*/		figlio=new Predatore(x+1, y, true);
						simulation.addCella(new Cella(figlio));
					}else if(x-1>=0 && simulation.mondo[x-1][y].contenuto=='+'){
			/*su*/		figlio=new Predatore(x-1, y, true);
						simulation.addCella(new Cella(figlio));
					}else if(y-1>=0 && simulation.mondo[x][y-1].contenuto=='+'){
			/*sinistra*/figlio=new Predatore(x, y-1, true);
						simulation.addCella(new Cella(figlio));
					}else if(y+1<20 && simulation.mondo[x][y+1].contenuto=='+'){
			/*destra*/	figlio=new Predatore(x, y+1, true);
						simulation.addCella(new Cella(figlio));
					}
					break;
			case 3:	if(y+1<20 && simulation.mondo[x][y+1].contenuto=='+'){
			/*destra*/	figlio=new Predatore(x, y+1, true);
						simulation.addCella(new Cella(figlio));
					}else if(x-1>=0 && simulation.mondo[x-1][y].contenuto=='+'){
			/*su*/		figlio=new Predatore(x-1, y, true);
						simulation.addCella(new Cella(figlio));
					}else if(y-1>=0 && simulation.mondo[x][y-1].contenuto=='+'){
			/*sinistra*/figlio=new Predatore(x, y-1, true);
						simulation.addCella(new Cella(figlio));
					}else if(x+1<20 && simulation.mondo[x+1][y].contenuto=='+'){
			/*giu*/		figlio=new Predatore(x+1, y, true);
						simulation.addCella(new Cella(figlio));
					}
					break;
		}
	}
}
