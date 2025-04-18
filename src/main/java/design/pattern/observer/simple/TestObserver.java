package design.pattern.observer.simple;

public class TestObserver {

    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(80);

        //simpleSubject.removeObserver(simpleObserver);
    }

}
