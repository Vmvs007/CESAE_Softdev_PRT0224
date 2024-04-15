package Ex_01;

public class Main {
    public static void main(String[] args) {
        Musica musica1= new Musica("Bohemian Rapsody","Rock","Queen",3600);
        Musica musica2 = new Musica("Mestre da Culinaria","Pimba","Quim Barreiros",3650);
        Musica musica3 = new Musica("The Scientist","Rock Alternativo","Coldplay",20);
        Musica musica4 = new Musica("Agua","Pimba","Quim Barreiros",20);

        MusicPlayer mp = new MusicPlayer();
        mp.addMusica(musica1);
        mp.addMusica(musica2);
        mp.addMusica(musica3);
        mp.addMusica(musica4);

        mp.imprimirRelatorio();

        mp.duracaoProgramacao();
    }
}
