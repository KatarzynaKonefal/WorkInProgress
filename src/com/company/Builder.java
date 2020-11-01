package com.company;

public abstract class Builder {

    protected House house;

    public House newHouse() {
        return house = new House();
    }

        public House getHouse () {
            return house;
        }

        public abstract void buildFoundation ();
        public abstract void buildGarage ();
        public abstract void buildRoof ();
        public abstract void buildTerrace ();

    }


