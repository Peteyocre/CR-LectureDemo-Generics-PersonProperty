package com.zipcodewilmington.person.generic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 3/8/18.
 */
public class PersonPropertyTest {
    @Test
    public void testInteger() {
        // Given
        Integer expected = Integer.MAX_VALUE;
        PersonProperty<Integer> personProperty = new PersonProperty<>(expected);

        // When
        Integer actual = personProperty.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testString() {
        // Given
        String expected = "_";
        PersonProperty<String> personProperty = new PersonProperty<>(expected);

        // When
        String actual = personProperty.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testDate() {
        // Given
        Date expected = new Date(System.currentTimeMillis());
        PersonProperty<Date> personProperty = new PersonProperty<>(expected);

        // When
        Date actual = personProperty.getValue();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
