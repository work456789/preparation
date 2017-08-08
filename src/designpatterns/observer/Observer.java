package designpatterns.observer;

import java.math.BigDecimal;

public interface Observer {
    void update(Observer observer, String productName, BigDecimal bidAmount);
}
