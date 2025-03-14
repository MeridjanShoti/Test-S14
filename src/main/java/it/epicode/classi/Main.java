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
                System.out.println("inserisci il titolo del media");
                String titolo = scanner.nextLine();
                System.out.println("seleziona tipo del file");
                System.out.println("audio, video, immagine");
                String tipo = scanner.nextLine();
                int durata = 0;
                if (tipo.equals("audio") || tipo.equals("video")) {
                    System.out.println("inserisci la durata");
                    durata = scanner.nextInt();
                    scanner.nextLine();
                }
                switch (tipo) {
                    case "audio":
                        media[i] = new Audio(titolo, durata);
                        break;
                    case "video":
                        media[i] = new Video(titolo, durata);

                        break;
                    case "immagine":
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
            System.out.println("1-5 per media 0 per uscire");
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
                default:
                    System.out.println("scrivi solo 1-5 o 0 per uscire");
            }
        }
    }
}
