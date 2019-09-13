package nivel2;
import nivel1.Jogador;
public class Profissional extends Jogador{
    private double capital;

    public Profissional(String nome, int score,double capital) {
    	super(nome,score);
    	this.capital = capital;
    }

    public void imprimir() {
    	super.imprimir();
    	System.out.println("capital = " + this.capital);
    }

    public void ganhar(int p) {
    	this.score = this.score + p;
    	this.capital = this.capital + p * 4;
    }

    public void perder(int p) {
    	this.score = this.score - p;
    	this.capital = this.capital - p * 4;
    }
}
