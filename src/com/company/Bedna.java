package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bedna {

    private int maxVaha;
    private int vaha;
    private List<Nastroj> nastroje;

    public Bedna(int maxVaha) {
        this.maxVaha = maxVaha;
        this.vaha = 0;
        this.nastroje = new ArrayList<>();
    }

    public void add(Nastroj nastroj) {
        if (vaha + nastroj.getVaha() > maxVaha) {
            System.out.println("Nastroj už se do bedny nevejde.");
            return;
        }
        System.out.println("Pridavam do bedny: "+ nastroj.getNazev());
        nastroje.add(nastroj);
        vaha += nastroj.getVaha();
    }

    public void remove(String name) {
        boolean removed = false;
        for (int i = 0; i < nastroje.size(); i++) {
            Nastroj nastroj = nastroje.get(i);
            if (nastroj.getNazev().equalsIgnoreCase(name)) {
                System.out.println("Vyndavam nastroj: " + nastroj);
                nastroje.remove(nastroj);
                vaha-=nastroj.getVaha();
                removed = true;
            }
        }

        if (!removed) {
            System.out.println("Tento nástroj tam není");
        }
    }

    public int sumKladiv() {
        int sumVah = 0;
        for (Nastroj nastroj : nastroje) {
            if (nastroj instanceof Kladivo kladivo) {
                if (kladivo.isObourucni()) {
                    sumVah += kladivo.getVaha();
                }
            }
        }
        return sumVah;
    }

    public void vsePracuj() {
        for (Nastroj nastroj : nastroje) {
            System.out.println(nastroj.pracuj());
        }
    }

    public void print() {
        for (Nastroj nastroj : nastroje) {
            System.out.println(nastroj);
        }
        System.out.println();
    }


    // getters && setters  //

    public List<Nastroj> getNastroje() {
        return Collections.unmodifiableList(nastroje);
    }

    public int getMaxVaha() {
        return this.maxVaha;
    }

    public int getVaha() {
        return this.vaha;
    }

}
