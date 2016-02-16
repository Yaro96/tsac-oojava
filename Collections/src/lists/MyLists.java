package lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

class Person {
	private String name;
	private String sur;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSur() {
		return sur;
	}
	public void setSur(String sur) {
		this.sur = sur;
	}
	
	// necessaria per contains su liste
	@Override
	public boolean equals(Object obj) {
		// due persone uguali PER ME se hanno lo stesso nome;
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		return this.name.equals(p.name);
	}
	
	
}

public class MyLists {
	
	public static void main(String[] args) {
		
		// List di objects
		{
			ArrayList aobject = new ArrayList();
			
			aobject.add("Pippo");
			aobject.add(new Person());

			int x = 5;
			Integer ix = x; // boxing: "sempre OK"		
			int y = ix; // unboxing: "potrebbe dare problemi"
			// Perchè?
			// perchè un oggetto può essere null
			
			aobject.add(x); // boxing
			
			Object o1 = aobject.get(1);
			if (o1 instanceof Person) {
				Person p1 = (Person)o1;
				//
			}
		}
		
		{
			// arraylist stringa
			ArrayList<String> astring = new ArrayList<String>();
			astring.add("Pippo");
			//astring.add(new Person()); una persona non è una stringa!
			astring.add("Prova");
			
			String s = astring.get(1);
			System.out.println(s);
			
			//
			ArrayList<Person> apersons = new ArrayList<>(); // non serve indicare il tipo dato
			apersons.add(new Person());
			//...			
		}
		
		{
			// covariance
			List<Person> apersonlist = new ArrayList<>();
			apersonlist.add(new Person());			
		}
		
		{
			// contains (indexof)
			List<String> ls = new ArrayList<>();
			ls.add("s1");
			ls.add("s2");
			ls.add("s3");
			ls.add("s4");
			
			System.out.println("contiene s3? " + ls.contains("s3"));
			System.out.println("contiene s5? " + ls.contains("s5"));
			
			// implementiamo il nostro contains.
			String mystringtocheck = "s";
			mystringtocheck += "3";
			
			System.out.println("contiene s3? " + contains(ls, mystringtocheck));
			
		}
		
		{
			List<Person> ls = new ArrayList<>();
			Person p1 = new Person();
			p1.setName("pippo");
			ls.add(p1);
			
			Person p2 = new Person();
			p2.setName("pluto");
			ls.add(p2);
			
			Person pcheck = new Person();
			pcheck.setName("pippo");
			System.out.println("contiene pippo? " + contains(ls, pcheck));
		}
		
		{
			Integer i1 = 305;
			Integer i2 = 6;
			Integer i3 = 305;
			
			if (i1.equals(i3)) {
				System.out.println("Siii " + i1 + " è uguale a " + i3 );
			} else {
				System.out.println("Nooo " + i1 + " è DIVERSO da " + i3 );
			}
		}
		
		{
			List<Integer> li = new ArrayList<Integer>();
			li.add(5);
			li.add(6);
			li.add(3);
			li.add(30);
			
			Optional<Integer> res = li.stream().
					map(x -> x * 2). // sostituisce ogni valore con il doppio
					reduce((a, x) -> a + x); // somma gli elementi.
			
			int x = res.orElse(0); // if null restituisce 0
			System.out.println(x);
			
			
			// ITERATOR
			
			Iterator<Integer> iters = li.iterator();
			
			while (iters.hasNext()) {
				int val = iters.next();
				
				
				System.out.println(val);
			}
			
			
		}
		
		
		
	}
	
	static public boolean contains(List<Person> ls, Person stocheck) {
		for(Person p: ls) {
			if (p.equals(stocheck)) {
				return true;
			}
		}
		return false;
	}
	
	static public boolean contains(List<String> ls, String stocheck) {
		for(String s: ls) {
			if (s.equals(stocheck)) {
				return true;
			}
		}
		return false;
	}
	

}
