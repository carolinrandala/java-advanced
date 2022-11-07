package org.sda.generics;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Fruit class for Generic
 *
 * @author carolinrandala
 */

@Data
public class Fruit implements Serializable { //This class can be Serialized and Deserialized
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
