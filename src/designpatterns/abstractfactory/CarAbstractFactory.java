package designpatterns.abstractfactory;

public interface CarAbstractFactory {
    Engine createEngine();
    Wheel createWheel();
}
