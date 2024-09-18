
public class Main {

	public static void main(String[] args) {
		VideojuegosDAOImpl dao = new VideojuegosDAOImpl();
		/**
		 * No quisiera tener que preocuparme aqui por metodos internos del dao, solo
		 * quisiera tener acceso a los definidos en el interfaz
		 */
		dao.Conectar();

//		No puedo crear directamente un objeto de un interfaz

//		VideojuegosDAO daoInterfaz = new VideojuegosDAO();

//		Mejor opcion, mas comun en un proyecto empresarial
		
		VideojuegosDAO videojuegosDAO = new VideojuegosDAOImpl();
	}

}
