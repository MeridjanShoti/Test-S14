package it.epicode.classi;

public class Immagine extends Media implements Visivo {
    static int luminosita = 5;
    public Immagine(String title) {
        super(title, 0);
    }
    public void show() {

    }
    @Override
    public void execute() {
        show();
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void abbassaLuminosita() {

    }
}
