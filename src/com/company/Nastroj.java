package com.company;

public abstract class Nastroj {

    private int vaha;
    private String nazev;

    public Nastroj(int vaha, String nazev) {
        this.vaha = vaha;
        this.nazev = nazev;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" "+nazev+" s vahou "+vaha;
    }


    public abstract String pracuj();

    public int getVaha() {
        return vaha;
    }

    public String getNazev() {
        return nazev;
    }
}

