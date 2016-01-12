
public class CambiaMonete {

	static void cambiaMonete(int val){
		int cinquecento=0;
		int duecento=0;
		int cento=0;
		int cinquanta=0;
		int venti=0;
		int dieci=0;
		int cinque=0;
		int due=0;
		int uno=0;
		
		while(val>0){
			if(val>=500){
				cinquecento++;
				val-=500;
			}else if(val>=200){
				duecento++;
				val-=200;
			}else if(val>=100){
				cento++;
				val-=100;
			}else if(val>=50){
				cinquanta++;
				val-=50;
			}else if(val>=20){
				venti++;
				val-=20;
			}else if(val>=10){
				dieci++;
				val-=10;
			}else if(val>=5){
				cinque++;
				val-=5;
			}else if(val>=2){
				due++;
				val-=2;
			}else if(val>=1){
				uno++;
				val-=1;
			}
		}
		System.out.println("Cinquecento: "+cinquecento);
		System.out.println("Duecento: "+duecento);
		System.out.println("Cento: "+cento);
		System.out.println("Cinquanta: "+cinquanta);
		System.out.println("Venti: "+venti);
		System.out.println("Dieci: "+dieci);
		System.out.println("Cinque: "+cinque);
		System.out.println("Due: "+due);
		System.out.println("Uno: "+uno);
	}
	
	public static void main(String[] args) {
		int valore=1024;
		cambiaMonete(valore);
	}
}
