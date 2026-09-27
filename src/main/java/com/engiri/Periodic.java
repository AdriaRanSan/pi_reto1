package com.engiri;
import java.util.ArrayList;
import java.util.Iterator;

public class Periodic {
    private ArrayList<Noticia> noticies;
    private int numNoticies;
    private final int MAX_NOTICIES = 1000;

    public Periodic() {
        noticies = new ArrayList<>(MAX_NOTICIES);
        numNoticies = 0;
    }

    public void inserta(Noticia n) {
        if (numNoticies < MAX_NOTICIES) {
            noticies.add(n);
            numNoticies++;
        }
    }

    public Noticia primeraNoticia(int d, int m, int a) {
        for (Noticia n : noticies) {
            if (n.igualData(d, m, a)) {
                return n;
            }
        }
        return null;
    }

    public void mesPopulars() {
        if (noticies.isEmpty()) {
            System.out.println("No hi ha noticies disponibles.");
            return;
        }

        int maxLectures = 0;
        for (Noticia n : noticies) {
            if (n.getLectures() > maxLectures) {
                maxLectures = n.getLectures();
            }
        }

        if (maxLectures == 0) {
            System.out.println("Cap noticia ha sigut llegida.");
            return;
        }

        System.out.println("Noticies més populars:");
        for (Noticia n : noticies) {
            if (n.getLectures() == maxLectures) {
                System.out.println(n);
            }
        }
    }

    
    public void mostrar() {
        if (noticies.isEmpty()) {
            System.out.println("No hi ha noticies disponibles.");
            return;
        }
        System.out.println("Totes les noticies:");
        for (Noticia n : noticies) {
            System.out.println(n);
        }
    }

    public void borrarAnteriors(int d, int m, int a) {
        int dataLlimit = a * 10000 + m * 100 + d;

        System.out.printf("S'esborraran les noticies anteriors a %02d/%02d/%04d...%n", d, m, a);

        Iterator<Noticia> it = noticies.iterator();
        while (it.hasNext()) {
            Noticia n = it.next();
            if (n.getData() < dataLlimit) {
                it.remove();
                numNoticies--;
            }
        }
    }
}