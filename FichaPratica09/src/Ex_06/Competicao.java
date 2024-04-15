package Ex_06;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] listaParticipantes;

    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.listaParticipantes = new Atleta[20];
    }

    public void addAtleta(Atleta novoAtleta) {
        for (int i = 0; i < this.listaParticipantes.length; i++) {
            if (this.listaParticipantes[i] == null) {
                this.listaParticipantes[i] = novoAtleta;
                return;
            }
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("País: " + this.pais);
        System.out.println("Lista de Participantes: ");
        for (int i = 0; i < this.listaParticipantes.length; i++) {
            if (this.listaParticipantes[i] != null) {
                this.listaParticipantes[i].exibirDetalhes();
            }
        }
    }
}
