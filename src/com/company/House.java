package com.company;

public class House {

    private String foundotation;
    private String garage;
    private String terrace;
    private String roof;


    public void setFoundotation(String foundotation){
        this.foundotation=foundotation;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
    public void setTerrace (String terrace){
        this.terrace = terrace;
    }

    public void description() {
        if (foundotation != null)
            System.out.println(foundotation + "done");
        if (garage != null)
            System.out.println(garage + "done");
        if (terrace != null)
            System.out.println(terrace + "done");
        if (roof != null)
            System.out.println(roof + "done");
    }
}
