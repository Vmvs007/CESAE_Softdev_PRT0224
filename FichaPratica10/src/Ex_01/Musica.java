package Ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    public Musica(java.lang.String titulo, java.lang.String genero, java.lang.String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public void exibirDetalhes() {
        System.out.println(this.titulo + " | " + this.genero + " | " + this.artista + " | " + this.duracao);
    }
}
