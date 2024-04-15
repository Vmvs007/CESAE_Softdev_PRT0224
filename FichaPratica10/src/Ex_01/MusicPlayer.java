package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    public void addMusica(Musica musicaNova){
        this.programacao.add(musicaNova);
    }

    public void removeMusica(Musica musicaRemover){
        this.programacao.remove(musicaRemover);
    }

    public void removeMusica(int indexRemover){
        this.programacao.remove(indexRemover);
    }

    public void trocarMusica(int index, Musica musicaNova){
        this.programacao.set(index,musicaNova);
    }

    public void trocarMusica(int index1, int index2){
        Musica musicaAux = this.programacao.get(index1);
        this.programacao.set(index1,this.programacao.get(index2));
        this.programacao.set(index2,musicaAux);
    }

    public void limparLista(){
        this.programacao.clear();
    }

    public void imprimirRelatorio(){
        int contador=1;

        for(Musica musicaAtual : this.programacao){
            System.out.print("Musica "+ contador++ +": ");
            musicaAtual.exibirDetalhes();
        }
    }
}
