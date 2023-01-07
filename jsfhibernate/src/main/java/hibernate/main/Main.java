package hibernate.main;

import hibernate.entities.Usuario;
import hibernate.util.DAO;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setSenha("123");
		usuario.setUsuario("user");

		DAO<Usuario> daousuario = new DAO<Usuario>(Usuario.class);

		daousuario.abrir()
		.create(usuario)
		.fechar();
	}

}
