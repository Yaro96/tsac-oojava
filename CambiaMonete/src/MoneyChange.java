

public abstract class MoneyChange {
	public static Money[] money = new Money[]{new Money(500,"banconot"),
			new Money(200,"banconot"),
			new Money(100,"banconot"),
			new Money(50,"banconot"),
			new Money(20,"banconot"),
			new Money(10,"banconot"),
			new Money(5,"banconot"),
			new Money(2,"monet"),
			new Money(1,"monet")

	}; //valuta utilizzabile
	//money non è un array di int ma di money <- new class.
	
	public static Money[] change(int value){
		Money[] rip = new Money[999];
		int j=0;
		for (int i = 0; i < money.length; i++) {
			int rep = value / money[i].getValue(); 
			value -= money[i].getValue() * rep;
			while(rep>0){
				rip[j]=new Money(money[i].getValue(),money[i].getType());
				rep--;
				j++;
			}
		}
		Money[] ripetitions = new Money[j];
		for(int k=0;k<j;k++){
			ripetitions[k]=rip[k];
		}
		
		return ripetitions;
	}
	
	public static void count(Money[] money){
		Money m1=new Money(money[0].getValue(),money[0].getType());
		Money m2=new Money(money[0].getValue(),money[0].getType());
		char plurale;
		int j=1;
		for(int i=1;i<money.length;i++){
			m2=money[i];
			if(m1.getValue()!=m2.getValue()){
				plurale = j==1 ? 'a' : 'e';	
				System.out.println(j+" "+m1.getType()+""+plurale+" da "+m1.getValue()+" euro");
				j=1;
			}else
				j++;
			m1=new Money(m2.getValue(),m2.getType());
		}
		plurale = j==1 ? 'a' : 'e';	
		System.out.println(j+" "+m2.getType()+""+plurale+" da "+m2.getValue()+" euro");
	}
}