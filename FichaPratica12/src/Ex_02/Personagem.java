package Ex_02;

public class Personagem extends Entidade {

    private int nivel=1;
    private CategoriaPersonagem categoria;
    private String arma;

    public Personagem(String nome, int vida, int forca, CategoriaPersonagem categoria, String arma) {
        super(nome, vida, forca);
        this.categoria = categoria;
        this.arma = arma;
    }

    public Entidade atacar(NPC inimigo) {

        // Guardo a vida inicial da personagem
        int vidaInicialPersonagem = this.getVida();

        while (this.getVida() > 0 && inimigo.getVida() > 0) {

            // Ataca a personagem - tiro vida ao inimigo de acordo com a força da personagem
            inimigo.setVida(inimigo.getVida() - this.getForca());
            // System.out.println("Atacaste "+inimigo.getNome());

            if (inimigo.getVida() > 0) {
                // Ataca o inimigo - tiro vida à personagem de acordo com a força do inimigo
                this.setVida(this.getVida() - inimigo.getForca());
                // System.out.println("Foste atacado");
            }
        }

        // Personagem ganhou
        if (this.getVida() > 0) {
            System.out.println("Parabéns " + this.categoria + " " + this.getNome() + ", ganhou um combate contra um " + inimigo.getNome() + " com o uso de " + this.arma);
            this.nivel++;
            // Fazer cast para ignorar parte decimal do aumento
            this.setVida((int) (vidaInicialPersonagem*1.1));
            this.setForca((int) (this.getForca()*1.1));

            return this;
        } else {
            // Ganhou o inimigo
            System.out.println("Perdeu");
            return inimigo;
        }


    }
}
