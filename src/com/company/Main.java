package com.company;

public class Main {

    public static void main(String[] args) {

        Bedna bedna= new Bedna(10000);
        bedna.add(new Kladivo(1000, "Kladívko", false ));
        bedna.add(new Kladivo(3000,"Velké kladivo", true));
        bedna.add(new Kladivo(4000, "Bourací kladivo", true));
        bedna.add(new Sroubovak(500, "Šroubovák Philips"));
        bedna.add(new Pila(2000,  "Zrezivělá pila"));
        bedna.add(new ElektrickySroubovak(1000, "Elektrický šroubovák Bosh", 100));
        System.out.println();
        bedna.print();

        bedna.remove("Zrezivělá pila");
        bedna.remove("Kladívko");
        bedna.remove("Šroubovák Philips");
        bedna.add(new Pila(2000,  "Zrezivělá pila"));

        System.out.println();
        bedna.print();

        bedna.vsePracuj();

        System.out.println();
        System.out.println(bedna.sumKladiv());

    }


}
