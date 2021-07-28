package bd;

import java.util.ArrayList;

import model.Plato;

public class PlatoBd {
	
	public static ArrayList<Plato> platoList = new ArrayList<>();

	public PlatoBd() {
		if (PlatoBd.platoList.isEmpty()) {
			PlatoBd.platoList.add(new Plato(1, "Vino - Louis Vallon",
					"El Louis Vallon Bordeaux Rouge viene de la región de l’Entre-deux-Mers. El viñedo está ubicado a más o menos 80 kilómetros al sureste de la ciudad de Bordeaux y es uno de los más amplios sectores vitícolas del Bordeaux.",
					"https://images.vivino.com/labels/9afbXT5JQDeDNtbJc3VJHA.jpg", 50.00));

			PlatoBd.platoList.add(new Plato(2, "Ceviche",
					"El representante gastronómico peruano más reconocido a nivel internacional. Motivo de orgullo y símbolo de identidad nacional. Es tanto su éxito que es servido con diversas variaciones en otros países de Latinoamérica.",
					"https://peru.info/Portals/0/Images/Productos/6/32-imagen-9392211122017.jpg", 25.00));
		}
	}

}
