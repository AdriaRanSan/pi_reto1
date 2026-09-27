package com.engiri;
public class Noticia {
    
    private int data;      
    private int hora;       
    private String text;  
    private int lectures;   

    // Constructor
    public Noticia(int data, int hora, String text) {
        this.data = data;
        this.hora = hora;
        this.text = text;
        this.lectures = 0; // Cap lectura
    }

    // Torna la data en format aaaammdd
    public int getData() {
        return data;
    }

    // Torna el nombre de lectures
    public int getLectures() {
        return lectures;
    }

    // Incrementa el nombre de lectures en 1
    public void incLectures() {
        lectures++;
    }

    // Comproba si la data d/m/a coincideix amb la data de la noticia
    public boolean igualData(int d, int m, int a) {
        int dataComparar = a * 10000 + m * 100 + d;
        return this.data == dataComparar;
    }

    // Representació en text de la noticia
    @Override
    public String toString() {
         int dia = data % 100;
        int mes = (data / 100) % 100;
        int any = data / 10000;

        String s = "";
        s += String.format("%02d/%02d/%04d - ", dia, mes, any);
        s += String.format("%02d:%02d\n", (hora / 100), (hora % 100));
        s += text + "\n";
        s += "Llegida " + lectures + " voltes\n";
        return s;
}
}
