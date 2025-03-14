package it.epicode.classi;

public class Immagine extends Media {

    public Immagine(String title) {
        super(title, 0);
    }
    public void show() {
        String puntiLuminosita = "";
        for(int i = 0; i < luminosita; i++) {
            puntiLuminosita += "*";
        }
        System.out.println(title + " " + puntiLuminosita);
    }
    @Override
    public void execute() {
        show();
    }


}
