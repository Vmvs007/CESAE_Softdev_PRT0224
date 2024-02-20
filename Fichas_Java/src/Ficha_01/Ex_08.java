package Ficha_01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int totalSeg, minutos, segundos, horasAlbum, minutosAlbum, segundosAlbum;

        // Ler musica 1
        System.out.print("Minutos Musica 1: ");
        minutos = input.nextInt();
        totalSeg = minutos * 60;

        System.out.print("Segundos Musica 1: ");
        segundos = input.nextInt();
        totalSeg = totalSeg + segundos;

        // Ler musica 2
        System.out.print("Minutos Musica 2: ");
        minutos = input.nextInt();
        totalSeg = totalSeg + (minutos * 60);

        System.out.print("Segundos Musica 2: ");
        segundos = input.nextInt();
        totalSeg = totalSeg + segundos;

        // Ler musica 3
        System.out.print("Minutos Musica 3: ");
        minutos = input.nextInt();
        totalSeg = totalSeg + (minutos * 60);

        System.out.print("Segundos Musica 3: ");
        segundos = input.nextInt();
        totalSeg = totalSeg + segundos;

        // Ler musica 4
        System.out.print("Minutos Musica 4: ");
        minutos = input.nextInt();
        totalSeg = totalSeg + (minutos * 60);

        System.out.print("Segundos Musica 4: ");
        segundos = input.nextInt();
        totalSeg = totalSeg + segundos;

        // Ler musica 5
        System.out.print("Minutos Musica 5: ");
        minutos = input.nextInt();
        totalSeg = totalSeg + (minutos * 60);

        System.out.print("Segundos Musica 5: ");
        segundos = input.nextInt();
        totalSeg = totalSeg + segundos;

        System.out.println("\nTotal Segundos: "+ totalSeg);

        horasAlbum = totalSeg/3600;
        System.out.println("Horas: "+horasAlbum);

        minutosAlbum = (totalSeg/60)-(horasAlbum*60);
        System.out.println("Minutos: "+minutosAlbum);

        segundosAlbum = totalSeg-(horasAlbum*3600)-(minutosAlbum*60);
        System.out.println("Segundos: "+segundosAlbum);

    }
}
