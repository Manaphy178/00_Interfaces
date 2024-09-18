
public class VideojuegosDAOImpl extends MasterDAO implements VideojuegosDAO {

	@Override
	public void borrarVideojuego(int id) {
		System.out.println("Borrando videojuegos");
	}

	@Override
	public void darDeBajaVideojuego(int id) {
		System.out.println("Dando de baja videojuego");
	}

	@Override
	public void videojuegoEnOferta(double precioOferta, int id) {
		System.out.println("Poniendo en oferta videojuego");
	}

}
