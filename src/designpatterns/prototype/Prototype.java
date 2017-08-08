package designpatterns.prototype;

public interface Prototype extends Cloneable {
    Prototype clone() throws CloneNotSupportedException;
}
