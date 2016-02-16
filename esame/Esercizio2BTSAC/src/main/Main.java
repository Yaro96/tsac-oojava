package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//double[] array=new double[1000];
		int i=0;
		List<Double> array=new ArrayList<>();
		List<Integer> keys=new ArrayList<>();
		Map<Integer, Integer> ms = new HashMap<>();
		
		PressureSensor ps=new PressureSensor();
		
		PressureSensorListener psl=new PressureSensorListener() {
			
			@Override
			public void onSuccess(double pressure) {
				array.add(pressure);
			}
			
			@Override
			public void onFailed(PressureSensorException exception) {
				if(!keys.contains(exception.getErrorcode()))
					keys.add(exception.getErrorcode());
				if( ms.containsKey(exception.getErrorcode()) ){
				    int a = ms.get(exception.getErrorcode());
				    ms.put(exception.getErrorcode(), a + 1);
				}else{
				    ms.put(exception.getErrorcode(), 1);
				}
			}
		};
		
		ps.setListener(psl);
		
		while(i<1000){
			ps.next();
			i++;
		}
		
		double max=-999999999;
		double sum=0;
		double valore;
		for(i=0;i<array.size();i++){
			valore=array.get(i);
			if(valore>max)
				max=valore;
			sum+=valore;
		}
		double media=sum/array.size();
		System.out.println("Massimo= "+max);
		System.out.println("Media= "+Math.round(media)+"\n");
		
		int chiave=0;
		for(i=0;i<keys.size();i++){
			chiave=keys.get(i);
			System.out.println("errorCode "+chiave+" presente "+ms.get(chiave)+" volte");
		}
		
	}

}
