package lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class PersonPerSet {
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
	
	// necessaria per contains su hashset
	@Override
	public boolean equals(Object obj) {
		// due persone uguali PER ME se hanno lo stesso nome;
		if (!(obj instanceof PersonPerSet)) {
			return false;
		}
		PersonPerSet p = (PersonPerSet)obj;
		return this.name.equals(p.name);
	}
	
	// necessaria per contains su hashset
	public int hashCode() {
		return name.hashCode();
	}
	
}

class PersonPerTreeSet implements Comparable<PersonPerTreeSet> {
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
	
	// necessaria per contains su hashset
	@Override
	public boolean equals(Object obj) {
		// due persone uguali PER ME se hanno lo stesso nome;
		if (!(obj instanceof PersonPerTreeSet)) {
			return false;
		}
		PersonPerTreeSet p = (PersonPerTreeSet)obj;
		return this.name.equals(p.name);
	}
	
	@Override
	public int compareTo(PersonPerTreeSet o) {
		// negativo se this < o
		// positivo se this > o
		// zero se this is equals 0
		return this.name.compareTo(o.name);
	}
	
}


public class MySet {
	
	public static void main(String[] args) {
		
		{
		
			Set<String> sets = new HashSet<>();
			
			sets.add("pippo");
			sets.add("pluto");
			
			System.out.println(sets.contains("pippo"));
			
			Set<PersonPerSet> ls = new HashSet<>();
			PersonPerSet p1 = new PersonPerSet();
			p1.setName("pippo");
			ls.add(p1);
			
			PersonPerSet p2 = new PersonPerSet();
			p2.setName("pluto");
			ls.add(p2);
			
			PersonPerSet pcheck = new PersonPerSet();
			pcheck.setName("pippo");
			System.out.println("contiene pippo? " + ls.contains(pcheck));
		}
		{
		
			Set<PersonPerTreeSet> ls = new TreeSet<>();
			PersonPerTreeSet p1 = new PersonPerTreeSet();
			p1.setName("pippo");
			ls.add(p1);
			
			PersonPerTreeSet p2 = new PersonPerTreeSet();
			p2.setName("pluto");
			ls.add(p2);
			
			PersonPerTreeSet pcheck = new PersonPerTreeSet();
			pcheck.setName("pippo");
			System.out.println("contiene pippo? " + ls.contains(pcheck));
		}
	}
	

}