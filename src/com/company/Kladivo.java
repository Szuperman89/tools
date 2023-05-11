package com.company;

public class Kladivo extends Nastroj {

    private boolean obourucni;

    public Kladivo(int vaha, String nazev, boolean obourucni) {
        super(vaha, nazev);
        this.obourucni = obourucni;
    }

    @Override
    public String pracuj() {
        return "Zatloukavam";
    }

    @Override
    public String toString() {
        return super.toString()+" ktere je "+(obourucni? "obourucni": "jednorucni");
    }

    public boolean isObourucni() {
        return obourucni;
    }
}
