package com.example.domain;

/**
 * Created by bsheen on 4/11/17.
 */
public class Bar {

    Foo pityThe;

    public Bar() {
        pityThe = new Foo();
        pityThe.publicString = "I pity the foo";
        pityThe.protectedString = "I got no time for the jibba-jabba";
        pityThe.packageString = "Take it from me...Mr.T";
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bar{" +
                "pityThe=" + pityThe +
                '}';
    }
}
