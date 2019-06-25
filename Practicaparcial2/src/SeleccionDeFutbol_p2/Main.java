package SeleccionDeFutbol_p2;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) throws JSONException {
		
		ArrayList<Integrantes>integrante=new ArrayList<>();
		
		Coleccion coleccion=new Coleccion<Integrantes>();
		
		Integrantes I1=new Integrantes("Nico","Cris",10);
		
		JSONArray array=new JSONArray();
		
		try {
			for(Integrantes i:integrante) {
				JSONObject obj=new JSONObject();
				obj.put("nombre", i.getNombre());
				obj.put("Edad", i.getEdad());
				obj.put("Apelido", i.getApellido());
				
				array.put(obj);
				}	
			}	
			catch(JSONException exception) {
				exception.printStackTrace();
				}
			System.out.println(array.toString());
			String json=array.toString();
			try {
					JSONArray jsonarray=new JSONArray();
					for(int i=1; i<array.length();i++) {
						Integrantes integ=new Integrantes();
						JSONObject obje=jsonarray.getJSONObject(i);
						integ.setNombre(obje.getString("Nombre"));
					}			
				}
			catch(JSONException e) {
				e.printStackTrace();
			}
			
		

	}
}