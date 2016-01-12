
public class Main {

	public static void main(String[] args) {
		Student luca=new Student();
		
		luca.name="Luca";
		luca.surname="Rossi";
		int age=23;
		luca.age=age;
		luca.marks=new int[] {3,4,2,1,4};
		int media=luca.average();
		System.out.println("Media di Luca: "+media);
	}

}
