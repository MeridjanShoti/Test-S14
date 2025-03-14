package it.epicode.classi;

import java.util.Scanner;

public class Main {
    public static void esegui(Media a){

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Audio audio = new Audio("audio", 2);
        Video video = new Video("video", 3);
        video.alzaVolume();
        video.abbassaLuminosita();
        Immagine immagine = new Immagine("immagine");

        audio.execute();
        video.execute();
        immagine.execute();*/
        Media[] media = new Media[5];
        boolean continua = false;
        for (int i = 0; i < 5; i++) {
            do {
                continua = false;
                System.out.println("inserisci il titolo del media");
                String titolo = scanner.nextLine();
                System.out.println("seleziona tipo del file");
                System.out.println("a = audio,v = video, i = immagine");
                String tipo = scanner.nextLine();
                int durata = 0;
                if (tipo.equals("a") || tipo.equals("v")) {
                    boolean reinserisciDurata = false;
                    do {
                        System.out.println("inserisci la durata");
                        durata = scanner.nextInt();
                        scanner.nextLine();
                    } while (reinserisciDurata);
                }
                switch (tipo) {
                    case "a":
                        media[i] = new Audio(titolo, durata);
                        break;
                    case "v":
                        media[i] = new Video(titolo, durata);

                        break;
                    case "i":
                        media[i] = new Immagine(titolo);
                        break;
                    default:
                        System.out.println("tipo non valido");
                        continua = true;

                }
            } while (continua);

        }
        boolean continua2 = true;


        while (continua2){
            System.out.println("seleziona un media da riprodurre");
            System.out.println("1-5 seleziona il media da riprodurre \n6 abbassa il volume \n7 alza il volume  \n8 abbassa la luminosità \n9 alza la luminosità \n0 esci");
            switch (scanner.nextInt()){
                case 0:
                    continua2 = false;
                    System.out.println("arrivederci");
                    break;
                case 1:
                    media[0].execute();
                    break;
                case 2:
                    media[1].execute();
                    break;
                case 3:
                    media[2].execute();
                    break;
                case 4:
                    media[3].execute();
                    break;
                case 5:
                    media[4].execute();
                    break;
                case 6:
                    Media.abbassaVolume();
                    break;
                case 7:
                    Media.alzaVolume();
                    break;
                case 8:
                    Media.abbassaLuminosita();
                    break;
                case 9:
                    Media.aumentaLuminosita();
                    break;
                default:
                    System.out.println("scrivi solo numeri da 0 a 9");
            }
        }
    }
}
