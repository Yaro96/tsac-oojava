
public class Student {
	String name;
	String surname;
	int age;
	int[] marks;
	
				//obbligatorio se voglio un costruttore di default, 
	Student(){	//dopo averne inizializzato un'altro
		//costruttore vuoto
		//inizializza tutto a null
	}
	
	Student(String name, String surname){
		this.name=name;
		this.surname=surname;
	}
	
	int average(){
		int sum=0;
		for(int x: marks){
			sum+=x;
		}
		float avg=sum/marks.length;
		return Math.round(avg);
	}
	
}
