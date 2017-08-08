package designpatterns.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Car car = new NormalCar();
        Car sportCar = new SportCarDecoratorImpl(car);
        sportCar.goToWork();
    }
}
