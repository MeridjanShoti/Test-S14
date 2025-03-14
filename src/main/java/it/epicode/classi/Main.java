package it.epicode.classi;

public class Main {
    /*public static void esegui(Media a){
        if (a.durata>0) {
            a.play();
        } else {
            a.show();
        }
    }*/

    public static void main(String[] args) {
        Audio audio = new Audio("audio", 10);
        audio.play();
    }
}
