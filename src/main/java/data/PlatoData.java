package data;

import com.google.gson.*;

import bd.PlatoBd;

public class PlatoData {

	public void getPlatos() {
		String[] lista = new String[2];
		lista[0] = "asdas";
		lista[1] = "aasd";
		Gson gson = new Gson();
		String prueba = gson.toJson(PlatoBd.platoList);
		System.out.println(prueba);
	}

}
