package data;

import bd.UsuarioBd;
import model.Usuario; 

public class UsuarioData {

	public Usuario loginUsuario(String usuario, String password) {
		Usuario userLogin = null;
		int size = UsuarioBd.usuarioList.size();
		for (int i = 0; i < size; i++) {
			Usuario user = UsuarioBd.usuarioList.get(i);
			if(user.getUsuario().equals(usuario) && user.getPassword().equals(password)) {
				userLogin = user;
				break;
			}
			
		}
		return userLogin;
	}
}
