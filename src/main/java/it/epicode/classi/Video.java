package it.epicode.classi;

public class Video extends Media implements Riproducibile {

    @Override
    public void execute() {
        play();
    }

    public Video(String titolo, int durata) {
        super(titolo, durata);
        this.durata = durata;
    }

    @Override
    public void play() {
        String puntiVolume = "";
        for(int i = 0; i < volume; i++) {
            puntiVolume += "!";
        }
        String puntiLuminosita = "";
        for(int i = 0; i < luminosita; i++) {
            puntiLuminosita += "*";
        }
        for(int i = 0; i < durata; i++) {
            System.out.println(title + " " + puntiVolume + " " + puntiLuminosita);
        }
    }


}
