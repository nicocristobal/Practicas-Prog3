package Seleccion;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import SeleccionDeFutbol_p2.Integrantes;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integrantes>integrante=new ArrayList<>();
		
		Coleccion coleccion =new Coleccion<Integrantes>();
		
		Integrantes i1=new Integrantes("Nico", "CRis", 12);
		
		JSONArray array=new JSONArray();
		
		try {
			for(Integrantes i: integrante) {
				JSONObject obj=new JSONObject();
				obj.put("nombre", i.getNombre());
				obj.put("Apellido", i.getApellido());
				obj.put("Edad", i.getEdad());
				array.put(obj);
			}
		}
		catch(JSONException exception){
			exception.printStackTrace();
		}
		System.out.println(array.toString());
		
		String json=array.toString();
		try {
			JSONArray jsonarray=new JSONArray();
			for(int i=1;i<array.length();i++) {
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
