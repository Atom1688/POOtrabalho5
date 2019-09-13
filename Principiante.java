package nivel2;
import nivel1.Jogador;

public class Principiante extends Jogador {
    private double bonus;

    public Principiante(double bonus, String nome, int score){
        super(nome,score);
        this.bonus = bonus;
    }

    public void imprimir() {
    	super.imprimir();
    	System.out.println("bonus = " + this.bonus);
    }

    public void ganhar(int p) {
    	this.score = this.score + p;
    	this.bonus = this.bonus + (10/p) * 100; //10%
    }

    public void perder(int p) {
    	this.score = this.score - p;
    	this.bonus = this.bonus - (10/p) * 100; //10%
    }
}
