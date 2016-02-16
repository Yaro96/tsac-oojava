package lists;


import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Maps {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> ms = new HashMap<>();
		
		// inserisco key, value
		ms.put("Luca", 5); // luca è la key, 5 è il value (la key può 
		ms.put("Marco", 3);
		ms.put("Gigi", 2);
		ms.put("Marco", 8);
		
		// leggo
		
		ArrayList<String> astring = new ArrayList<String>();
		
		astring.add("Tymsilver2");
		astring.add("Nope");
		astring.add("Nope");
		astring.add("dincaimbroglione");
		
		Map<String, Integer> contatore = new HashMap<>();
		
		int a = 0;
		  
		  for(int i = 0; i < astring.size(); i++){
		   
		   if (contatore.containsKey(astring.get(i))){
		    a = contatore.get(astring.get(i));
		    contatore.put(astring.get(i), a + 1);
		   }
		   else{
		    contatore.put(astring.get(i), 1);
		   }
		  }
		
//		int a;
//		a = 0;
//		for(int i = 0; i < astring.size(); i++){
//			
//			
//			boolean ok = true;
//			
//			try {
//				a = contatore.get(astring.get(i));
//			}
//				catch(Exception e){
//					ok = false;
//				}
//			
//			
//			if(ok){
//				contatore.put(astring.get(i), a+1); // NB: per fare eseguire prima l'incremento mettere il ++ prima ://///////////// 
//			}
//			else{
//				contatore.put(astring.get(i), 1);
//			}
//			
//		}
		
		
		
		
		int x = contatore.get("Nope");
		System.out.println(x);
		
		// TODO
		// 1. Si utilizzi l'hashmap e il treemap utilizzando come chiave la classe persona.
		
		// 2. si supponga di avere un array di persone, contenente anche oggetti duplicati,
		// retituire un hashmap per ogni persona indichi quante volte è presente l'array iiniziale.
		
		// List                     => Map
		//["Luca", "Pluco", "Luca"] => {"Luca": 2, "Pluco" : 1}
		
		
		
	}

}