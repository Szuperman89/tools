package com.company;

public class Sroubovak extends Nastroj{

    public Sroubovak(int vaha, String nazev) {
        super(vaha, nazev);
    }

    @Override
    public String pracuj() {
        return "Sroubuji";
    }



}
