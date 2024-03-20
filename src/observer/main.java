package observer;

public class main {
    public static void Main(String[] args) {
        Payment payment = new Payment();
        Carrito carrito = new Carrito();
        Inventario inventario = new Inventario();
        Usuario usuario = new Usuario();

        payment.registerObserver(carrito);
        payment.registerObserver(inventario);
        payment.registerObserver(usuario);

        payment.realizarCompra();
    }
}