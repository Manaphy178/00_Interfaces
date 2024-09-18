
/**
 * en esta definicion solo puedo poner constantes, y definiciones de metodos,
 * nunca codigo de ellos
 */
public interface VideojuegosDAO {
	void borrarVideojuego(int id);

	void darDeBajaVideojuego(int id);

	void videojuegoEnOferta(double precioOferta, int id);
}
