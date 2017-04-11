package com.example.domain2;

import com.example.domain.Foo;

/**
 * Created by bsheen on 4/11/17.
 */
public class Foo2 extends Foo {

    public Foo2() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Foo2{" +
                "publicString='" + publicString + '\'' +
                ", protectedString='" + protectedString + '\'' + ", super=" + super.toString() + '\'' +
                '}';
    }
}
