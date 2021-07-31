package bd;

import java.util.ArrayList;

import model.Usuario;

public class UsuarioBd {

	public static ArrayList<Usuario> usuarioList = new ArrayList<>();

	public UsuarioBd() {
		if (UsuarioBd.usuarioList.isEmpty()) {
			UsuarioBd.usuarioList.add(new Usuario(1, "Antonio", "Seguil Tamayo", "prueba", "123", 0));
			UsuarioBd.usuarioList.add(new Usuario(2, "Sol", "Rodríguez Montalván", "Sol", "20010319", 0));
			UsuarioBd.usuarioList.add(new Usuario(3, "Carlos", "Zavala Guzmán", "zavala", "123", 1));
		}
	}

}
