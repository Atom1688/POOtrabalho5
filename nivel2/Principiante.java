package nivel2;
import nivel1.Jogador;

public class Principiante extends Jogador {
    private double bonus;

    public Principiante(double bonus, String nome, int score){
        super(nome, score);
        this.bonus = bonus;
    }
    public void print(){
        super.print();
        System.out.println(bonus);
    }
    public void ganhar(int p){
        score += p;
        bonus += (p*0.1);
    }
    public void perder(int p){
        score -= p;
        bonus -= (p*0.1);
    }
}