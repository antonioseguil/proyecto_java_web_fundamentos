package data;

import java.io.BufferedReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import bd.PedidoBd;
import model.Pedido;

public class PedidoData {
	
	public String allPedidos() {
		Gson gson = new Gson();
		return gson.toJson(PedidoBd.listPedido);
	}
	
	public String addItem(BufferedReader request) {
		
		Gson gson = new Gson();
		Pedido newPedido = gson.fromJson(request, Pedido.class);
		PedidoBd.listPedido.add(newPedido);
		return "{\"estado\":true}";
	}
	
	public void removeItem(String json) {
		
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = parser.parse(json).getAsJsonObject();
		int id = jsonObject.get("id").getAsInt();
		PedidoBd.listPedido.remove(id);
	}

}
