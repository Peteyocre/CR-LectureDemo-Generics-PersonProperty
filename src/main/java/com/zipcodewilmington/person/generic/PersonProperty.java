package com.zipcodewilmington.person.generic;

/**
 * Created by leon on 3/8/18.
 */
public class PersonProperty<E> {
    private E value;

    public PersonProperty(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}