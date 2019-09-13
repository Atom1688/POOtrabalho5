package nivel1;

public class Jogador {
    public String nome;
    private int score;

    public Jogador(String nome, int score){
        this.nome = nome;
        this.score = score;
    }

    void print(){
        System.out.println(nome);
        System.out.println(score);
    }
}

