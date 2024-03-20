package observer;

public class Carrito implements Observer {
	@Override
	public void update() {
		// Lógica para eliminar todos los productos del carrito
		System.out.println("Carrito: Todos los productos han sido eliminados del carrito.");
	}
}
