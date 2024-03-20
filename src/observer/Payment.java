package observer;
import java.util.List;
import java.util.ArrayList;


public class Payment implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void realizarCompra() {
        // Lógica de la compra
        notifyObservers();
    }
}
