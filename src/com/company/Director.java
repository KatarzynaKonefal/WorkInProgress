package com.company;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public House getHouse() {
        return builder.getHouse();
    }
     public void buildHouse(){
        builder.newHouse();
        builder.buildFoundation();
        builder.buildGarage();
        builder.buildRoof();
        builder.buildTerrace();
     }

}
