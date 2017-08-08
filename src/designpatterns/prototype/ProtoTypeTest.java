package designpatterns.prototype;

public class ProtoTypeTest {
    public static void main(String[] args) {
        try {
            Employee employee = (Employee) PrototypeFactory.getPrototype("Gosho");
            System.out.println(employee.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
