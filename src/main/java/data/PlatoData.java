package data;

import com.google.gson.*;

import bd.PlatoBd;

public class PlatoData {

	public String getPlatos() {
		Gson gson = new Gson();
		String jsonresponse = gson.toJson(PlatoBd.platoList);
		return jsonresponse;
	}

}
