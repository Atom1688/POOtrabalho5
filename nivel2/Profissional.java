package nivel2;
import nivel1.Jogador;

public class Profissional extends Jogador {
    private double capital;

    public Profissional(String nome, int score, double capital){
        super(nome, score);
        this.capital = capital;
    }
    public void print() {
        super.print();
        System.out.println(capital);
    }

    public void ganhar(int p){
        score += p;
        capital = capital + (p*4);
    }
    public void perder(int p){
        score = score - p;
        capital = capital - (p*4);
    }
}
