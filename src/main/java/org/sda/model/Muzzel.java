package org.sda.model;

/**
 * Composition exercise:
 *
 * a) Create a muzzel class
 * b) Create a muzzel object
 * b) Assign the created object to a Dog object
 * c) How to use a Dog object to show all attributes of a Muzzel object?
 *
 * @author carolinrandala
 */
public class Muzzel {
    private Long id;
    private int noiseRange;
    private boolean isTooNoisy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNoiseRange() {
        return noiseRange;
    }

    public void setNoiseRange(int noiseRange) {
        this.noiseRange = noiseRange;
    }

    public boolean isTooNoisy() {
        return isTooNoisy;
    }

    public void setTooNoisy(boolean tooNoisy) {
        isTooNoisy = tooNoisy;
    }

    @Override
    public String toString() {
        return "Muzzel{" +
                "id=" + id +
                ", noiseRange=" + noiseRange +
                ", isTooNoisy=" + isTooNoisy +
                '}';
    }
}
