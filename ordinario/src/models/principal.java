package models;

import java.util.ArrayList;

public class principal {

    static ArrayList<Clases> clase = new ArrayList<Clases>();

    static int cantHoja = 99;
     static int tempoPicad = 18;
    static  int arom = 6;
    static int azuca = 6;
    static int nicotin = 6;

    public static void totalCigarros() {

        clase.add(new Clases(cantHoja, tempoPicad, arom, azuca, nicotin));

        System.out.println(clase.toString());

        picadoDesvenado();

    }

    public static void picadoDesvenado(){
        int tiempo = tempoPicad;
        for (int i = 0; i < tiempo; i++) {
            if (i == 0) {
                System.out.println("Arrancando la máquina");
            }
            System.out.println("Picado y desvenado " + i);
        }

        cantidadCigarros();
    }

    public static void cantidadCigarros() {

        int total = 0;
        for (int i = 0; i < clase.size(); i++) {
            total += clase.get(i).getCantHojas();
            total += clase.get(i).getTempoPicado();
            total += clase.get(i).getAroma();
            total += clase.get(i).getAzucar();
            total += clase.get(i).getNicotina();
        }
        System.out.println(total);

        cajetillasCigarros();
    }
    public static void cajetillasCigarros(){
        int total = 0;
        int excedente = 0;
        int cajetillas = 0;
        int matricula = 60699;
        if (matricula % 2 == 0) {
            cajetillas = 14;
        } else {
            cajetillas = 20;
        }
        for (int i = 0; i < clase.size(); i++) {
            total += clase.get(i).getCantHojas();
            total += clase.get(i).getTempoPicado();
            total += clase.get(i).getAroma();
            total += clase.get(i).getAzucar();
            total += clase.get(i).getNicotina();
        }
        if (total > cajetillas) {
            excedente = total - cajetillas;
            System.out.println("Cajetillas: " + cajetillas + "\nExcedente: " + excedente);
        } else {
            System.out.println("Cajetillas: " + cajetillas + "\nExcedente: " + excedente);
        }
    }

}
