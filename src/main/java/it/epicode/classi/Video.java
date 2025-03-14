package it.epicode.classi;

public class Video extends Media implements Riproducibile, Visivo {
    static int volume = 5;
    static int luminosita = 5;

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

    @Override
    public void abbassaVolume() {
        volume--;
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        luminosita--;
    }
}
