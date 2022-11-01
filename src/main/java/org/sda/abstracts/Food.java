package org.sda.abstracts;

public abstract class Food {
    private String color;

    public Food(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat(); //you can only define it here, but cannot write the implementation here. The impl will be in the extending class.

}
