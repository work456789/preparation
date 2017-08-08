package designpatterns.abstractfactory;

public class CityCarFactory implements CarAbstractFactory{
    public Engine createEngine() {
        return new CityEngine();
    }

    public Wheel createWheel() {
        return new CityWheel();
    }
}
