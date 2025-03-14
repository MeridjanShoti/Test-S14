package it.epicode.classi;

public class Audio extends Media implements Riproducibile{

    static int volume = 5;

    public static int getVolume() {
        return volume;
    }

    public static void setVolume(int volume) {
        Audio.volume = volume;
    }

    @Override
    public void play() {
    String puntiVolume = "";
    for(int i = 0; i < volume; i++) {
        puntiVolume += "!";
    }
        for(int i = 0; i < durata; i++) {
            System.out.println(title + " " + puntiVolume);
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

    public Audio (String titolo, int durata) {
        super(titolo, durata);
        this.durata = durata;
    }
}
