package nivel2;
import nivel1.Jogador;
import nivel2.*;

public class Senior extends Profissional {
    private double premio;

    public Senior(String nome, int score, double capital, double premio){
        super(nome, score, capital);
        this.premio = premio;
    }
    public void print(){
        super.print();
        System.out.println(premio);
    }
    public void ganhar(int p){
        super.ganhar(p);
        premio = premio*2;
    }
    public void perder(int p){
        super.perder(p);
        premio = premio/2;
    }
}
