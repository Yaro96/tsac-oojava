package bershadskyy.casestudy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class Main {
	
	
	public static void main(String[] args){
		
		// READ
		
		FileReader fr = null;
		try {
			fr = new FileReader("esercizi_vicinato_sede_fissa.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		GeoApiContext context = new GeoApiContext().setApiKey("AIza..");
		GeocodingResult[] results=null;
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("nomefileout.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		
		String row = null;
		try {
			row = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			row=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=0;
		// readline untile null
		while(i<500){
			String[] items = row.split(";");
			try {
				results =  GeocodingApi.geocode(context,
					    items[2]+" "+items[3]+" "+items[4]+" Milano").await();
			} catch (Exception e) {

			}
			
			System.out.println(results[0].geometry.location+";"+results[0].formattedAddress);
			pw.println(results[0].geometry.location+";"+results[0].formattedAddress);
			
			try {
				row=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
	}

}