package com.company;

public class ElektrickySroubovak extends Sroubovak{

    private int kapacita;

    public ElektrickySroubovak(int vaha, String nazev, int kapacita) {
        super(vaha, nazev);
        this.kapacita=kapacita;
    }

    @Override
    public String toString() {
        return super.toString()+" S "+kapacita+"% kapacitou";
    }

    public int getKapacita() {
        return kapacita;
    }

}
