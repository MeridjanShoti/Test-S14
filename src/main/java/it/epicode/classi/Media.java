package it.epicode.classi;

public abstract class Media {
    protected String title;
    protected int durata;

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


    public Media(String title, int durata) {
        this.title = title;
    }
}
