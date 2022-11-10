package org.sda.concurrency.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Synchronization base class
 */
@AllArgsConstructor
@Getter
public class ShoppingCart {
    private int numberOfProducts;

    public synchronized void addProduct(int quantity) {
        System.out.println("Adding product..");
        numberOfProducts += quantity;
    }

    public void removeProduct(int quantity) {
        System.out.println("Removing product..");
        numberOfProducts -= quantity;
    }
}
