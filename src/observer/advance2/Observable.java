package observer.advance2;

/**
 * 这是一个通用的被观察者接口，所有的被观察者都可以实现这个接口
 */
public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String context);
}
