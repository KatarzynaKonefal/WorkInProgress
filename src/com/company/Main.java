package com.company;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        Builder builderS = new SingleFamily();
        Builder builderSD = new SemiDetached();

        System.out.println();
    }
}
