package observer;

public class Usuario implements Observer {
    @Override
    public void update() {
        System.out.println("Usuario: Los productos comprados han sido notificados al usuario.");
    }
}