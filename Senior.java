package nivel3;
import nivel2.Profissional;
public class Senior extends Profissional{
    private double premio;

    public Senior(String nome, int score, double capital, double premio) {
    	super(nome,score,capital);
    	this.premio = premio;
    }

    public void imprimir() {
    	super.imprimir();
    	System.out.println("premio = " + premio);
    }

    public void ganhar(int p) {
    	super.ganhar(p);
    	this.premio = this.premio * 2;
    }

    public void perder(int p) {
    	super.perder(p);
    	this.premio = this.premio / 2;
    }
}
