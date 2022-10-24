package org.sda.model;

/**
 * Exercise 1
 *
 * @author carolinrandala
 */
public class Dog {
    private String name;
    private int age;
    private boolean isMale;
    private String race;
    private float weigth;

    public Dog(String name, int age, boolean isMale, String race, float weigth) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.race = race;
        this.weigth = weigth;
    }

    public Dog(boolean isMale, String race) {
        this("TOMMY", 2, isMale, race, 10.0f);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        if(weigth > 0.5) {
            this.weigth = weigth;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", race='" + race + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
