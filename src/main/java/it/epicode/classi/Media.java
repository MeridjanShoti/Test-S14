package it.epicode.classi;

public abstract class Media {
    protected String title;
    protected int durata;
    static int volume = 5;
    static int luminosita = 5;

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public abstract  void execute ();

    public Media(String title, int durata) {
        this.title = title;
    }
    public static void abbassaVolume(){
        if(volume >= 0) {
            volume--;
        } else System.out.println("Volume al minimo");
    }
    public static void alzaVolume(){
    if (volume <= 10) {
        volume++;
    } else System.out.println("Volume al massimo");
    }
    public static void aumentaLuminosita(){
if (luminosita <= 10) {
    luminosita++;
} else System.out.println("Luminosità al massimo");
    }
    public static void abbassaLuminosita(){
if (luminosita >= 0) {
    luminosita--;
} else System.out.println("Luminosità al minimo");
    }
}
