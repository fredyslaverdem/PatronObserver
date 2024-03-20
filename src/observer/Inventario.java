package observer;

public class Inventario implements Observer{
	@Override
	public void update() {
		// Logica para descontar las unidades del inventario
		System.out.println("Inventario: Las unidades han sido descontadas del inventario.");
	}
}

