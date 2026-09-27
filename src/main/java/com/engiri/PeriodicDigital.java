package com.engiri;

public class PeriodicDigital {
    public static void main(String[] args) {

        System.out.println("== PROVA 1: CREAR NOTICIES ==");
        Noticia n1 = new Noticia(20211030, 1005, "Noticia sobre economia.");
        Noticia n2 = new Noticia(20211030, 1200, "Noticia sobre deports.");
        Noticia n3 = new Noticia(20211101, 900, "Noticia internacional.");
        Noticia n4 = new Noticia(20190301, 1100, "Noticia politica.");
        Noticia n5 = new Noticia(20250501, 1315, "Noticia gamer.");

        System.out.println("== PROVA 2: INSERTAR ==");
        Periodic periodic = new Periodic();
        periodic.inserta(n1);
        periodic.inserta(n2);
        periodic.inserta(n3);
        periodic.inserta(n4);
        periodic.inserta(n5);

        // Simulem lectures
        n1.incLectures(); n1.incLectures();
        n2.incLectures(); n2.incLectures(); n2.incLectures();
        n3.incLectures(); n3.incLectures(); n3.incLectures();
        n4.incLectures(); n4.incLectures();
        n5.incLectures(); n5.incLectures(); n5.incLectures();

        System.out.println("\n== PROVA 3: PRIMERA NOTICIA ==");
        Noticia primera = periodic.primeraNoticia(30, 10, 2021);
        if (primera != null) {
            System.out.println(primera);
        } else {
            System.out.println("No hi ha noticies en aquesta data.");
        }

        System.out.println("\n== PROVA 4: MES POPULARS ==");
        periodic.mesPopulars();

        System.out.println("\n== PROVA 5: BORRAR ANTERIORS ==");
        periodic.borrarAnteriors(1, 11, 2021);
        System.out.println("Despres de borrar:");
        periodic.mostrar();
    }
}