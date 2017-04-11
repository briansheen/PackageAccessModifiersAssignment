package com.example.domain2;

import com.example.domain.Foo;

/**
 * Created by bsheen on 4/11/17.
 */
public class Bar2 {

    Foo2 sucka;

    public Bar2() {
        sucka = new Foo2();
        sucka.publicString = "As a kid, I got three meals a day. Oatmeal, miss-a-meal and no meal.";
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bar2{" +
                "sucka=" + sucka +
                '}';
    }
}
