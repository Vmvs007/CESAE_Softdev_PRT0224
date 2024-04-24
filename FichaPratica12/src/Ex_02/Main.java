package Ex_02;

public class Main {
    public static void main(String[] args) {

        Personagem vitor = new Personagem("Vitor S.",100,10,CategoriaPersonagem.FEITICEIRO,"Varinha Mágica");

        NPC ogre = new NPC("Shrek",30,10);
        NPC voldmort = new NPC("Voldmort",100,5);


        vitor.atacar(ogre);

        vitor.atacar(voldmort);

    }
}
