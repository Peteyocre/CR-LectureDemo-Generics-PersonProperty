package com.zipcodewilmington.person.generic;

import java.awt.*;
import java.util.Date;

/**
 * Created by leon on 3/8/18.
 */
public class GenericPerson {
    public final PersonProperty<String> name;
    public final PersonProperty<Date> birthdate;
    public final PersonProperty<Color> eyeColor;
    public final PersonProperty<Integer> socialSecurityNumber;

    public GenericPerson(String name, Date birthdate, Color eyeColor, Integer socialSecurityNumber) {
        this.name = new PersonProperty<>(name);
        this.birthdate = new PersonProperty<>(birthdate);
        this.eyeColor = new PersonProperty<>(eyeColor);
        this.socialSecurityNumber = new PersonProperty<>(socialSecurityNumber);
    }
}
