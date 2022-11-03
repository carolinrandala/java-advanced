package org.sda.generics;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Fruit class for Generic
 *
 * @author carolinrandala
 */

@Data
public class Fruit {
    private String name;
    private String color;
    private BigDecimal price;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
